package ds.queue;



public class App {
    public static void main(String[] args) throws QueueFullException, QueueEmptyException {

        Queue<Integer> myQueue = new Queue<Integer>(5);

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
       // myQueue.enqueue(6);

        myQueue.printQueue();
        myQueue.dequeue();

        myQueue.printQueue();
        myQueue.enqueue(6);
        myQueue.printQueue();
    }
}
