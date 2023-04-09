package ds.queue;
public class Queue<E> {
    private int maxSize; // Initializes the maximum number of slots
    private E[] queArray; // Slots to maintain the data.
    private int front; // Index position for the element in the front.
    private int rear; // Index position for the element at the back.
    private int nItems; // Counter to maintain the number of items in our queue.

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queArray = (E[]) new Object[maxSize];
        this.front = 0; // Index position for the first slot of the array.
        this.rear = -1; // There is no item in the array yet to be considered as the last item.
        this.nItems = 0; // We don't have elements in the array yet.
    }

    public void enqueue(E element) throws QueueFullException {
        if (isFull()) {
            throw new QueueFullException("Queue is full");
        }

        if (rear == maxSize - 1) {
            rear = -1; // This implements a circular queue.
        }
        rear++;
        queArray[rear] = element;
        nItems++;
    }

    public E dequeue() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty");
        }
        E temp = queArray[front];
        queArray[front] = null;
        front++;
        if (front == maxSize) {
            front = 0; // We can set front back to the 0th index so that we can utilize the entire array again.
        }
        nItems--;
        return temp;
    }

    public E peek() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty");
        }
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public void printQueue() {
        System.out.print("[");
        for (int i = 0; i < nItems; i++) {
            System.out.print(queArray[(front + i) % maxSize]);
            if (i != nItems - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }
}
class QueueFullException extends Exception {

    public QueueFullException(String message) {
        super(message);
    }
}class QueueEmptyException extends Exception {

    public QueueEmptyException(String message) {
        super(message);
    }
}