package Greedy.Greedy;
import java.util.*;

public class ActivitySelection {

    public static void main(String args[]) {
       int start[] = {1,3,0,5,8,5};
       int end [] = {2,4,6,7,9,9};   
       
       //end time basis sorted
       int maxAct = 0;
       ArrayList<Integer> ans = new ArrayList<>();

       maxAct = 1;
       int lastEnd = end[0];
       ans.add(0);

       for(int i = 1; i< end.length; i++){
         if(start[i] >= lastEnd){
            //activity selsct
            maxAct++;
            ans.add(i);
            lastEnd = end[i];
         }
       }
       System.out.println("Max Activity  " + maxAct);
       for(int i = 0; i<ans.size(); i++ ){
        System.out.print("A"  + ans.get(i));
       }
       System.out.println();


    }
    
}
