package ds.adt;

public class App {
    public static void main(String[] args) {
        ds.adt.Counter myCounter = new ds.adt.Counter("myCounter");

        myCounter.increment();
                myCounter.increment();
                myCounter.increment();
                myCounter.increment();
                myCounter.increment();
                myCounter.increment();
                myCounter.increment();
                myCounter.increment();

                System.out.println(myCounter.getCurrentValue());

    }
}
