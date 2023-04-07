package ds.stack;

public class Word_Reverse {

  String input;
    String output;


    void word_reverse(String input){
        this.input=input;
       int stackSize = input.length();

        Word_Reverse_Stack charStack = new Word_Reverse_Stack(stackSize);

         for(int i=0; i<input.length(); i++){
              char ch = input.charAt(i);
              charStack.push(ch);
         }

        while(!charStack.isEmpty()) {
            char ch =  charStack.pop();
            System.out.println(ch);

        }
    }



}
