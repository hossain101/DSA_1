package ds.stack;

public class Word_Reverse {

//  String input;
//  String output;


//    void word_reverse(String input){
//        this.input=input;
//       int stackSize = input.length();
//
//        Word_Reverse_Stack charStack = new Word_Reverse_Stack(stackSize);
//
//         for(int i=0; i<input.length(); i++){
//              char ch = input.charAt(i);
//              charStack.push(ch);
//         }
//
//        while(!charStack.isEmpty()) {
//            char ch =  charStack.pop();
//            System.out.println(ch);
//
//        }
//    }

public String reverseString(String str){
    int stackSize = str.length();
    Word_Reverse_Stack stringStack = new Word_Reverse_Stack(stackSize);

    for(int i = 0; i<str.length(); i++){
        char ch = str.charAt(i);
        stringStack.push(ch);
    }
    String result = "";

    while(!stringStack.isEmpty()){

        char ch = stringStack.pop();
        result=result+ch;

    }


    return result;
}

}
