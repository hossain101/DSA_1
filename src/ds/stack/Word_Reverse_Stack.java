package ds.stack;

public class Word_Reverse_Stack {
    private final int maxSize;
    private final char[] stackArray;
    private int top;


    public Word_Reverse_Stack(int size){
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char j){
        if(isFull()){
            System.out.println("Stack is full");

        }
        else {
            top++;
            stackArray[top] = j;
        }
    }

    public char pop(){

        if(isEmpty()){
            System.out.println("Stack is empty");
            return 1;
        }
        else {


            int old_top = top;
            top--;
            return stackArray[old_top];

        }
    }
    public long peak(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (maxSize -1 == top);
    }
}
