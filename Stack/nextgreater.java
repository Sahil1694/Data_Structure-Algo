package Stack;
import java.util.*;;

public class nextgreater {

    public static void main(String args[]) {
        int arr[] = {7,6,8,0,1};
        Stack<Integer> s = new Stack<>();
        int nxtgretaer[] = new int[arr.length];

        for(int i = arr.length-1; i >=0; i--){
            //1.while
            while(!s.empty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            //2.if else
            if(s.isEmpty()){
                nxtgretaer[i] = -1;
            }else{
                nxtgretaer[i] = arr[s.peek()];
            }
            //3 push
            s.push(i);

    } 
    for(int i = 0; i<nxtgretaer.length;i++){
        System.out.print(nxtgretaer[i] + " ");
    }
    System.out.println();
    
 }
}
