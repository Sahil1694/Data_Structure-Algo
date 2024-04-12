package Stack;

import java.util.Stack;

public class duplicatepara {

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length() ; i++){
            char ch = str.charAt(i);


            //closig
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                //opening 
                s.push(ch);
            }

        }
        return false;

    }


    public static void main (String[]args){

        String str = "((a+b))"; //true
        String stt2 = "(a-b)";//false;
        System.out.println(isDuplicate(stt2));
    }

    
}
