package ds.adt;

public class Counter {


    String name = null;

    int num= 0;
    Counter(String name){
        this.name  = name;
    }

    void increment(){
       num = num+1;
    }

    int getCurrentValue(){
        return num;
    }

    public String toString(){
        return  name+ ": " + num;
    }


}
