package adt;

public class App {
    public static void main(String[] args) {
        adt.Counter myCounter = new adt.Counter("myCounter");

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
