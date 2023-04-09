package ds.queue;

public class App {
    public static void main(String[] args){

        Queue myQueue = new Queue(5);
        myQueue.insert(100);
        myQueue.insert(1000);
        myQueue.insert(12);
        myQueue.insert(1040);
        myQueue.insert(193);
       // myQueue.insert(104);

        myQueue.view();

    }
}
