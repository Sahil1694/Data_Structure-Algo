package Greedy.Greedy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class fractionalKnapSack {

    public static void main(String args[]) {
      int val[] = {60,100,120}        ;
      int weight[] = {10,20,30};
      int w =50;


      double ratio[][] = new double[val.length][2];
      //0th col => idx
       
      for(int i = 0; i<val.length; i++){
        ratio[i][0] = i;
        ratio[i][1] = val[i]/(double)weight[i];
      }
      //ascending order
      Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
      
      int capacity = w;
      int finalvl = 0;

      for(int i =ratio.length - 1; i >=0 ; i--){
        int idx = (int)ratio[i][0];
        if(capacity >= weight[idx]){//include full item
                   finalvl += val[idx];
                   capacity -= weight[idx];
        }else{
            //include fractional value
            finalvl += (ratio[i][1] * capacity);
            capacity = 0;
            break;
        }
        System.out.println(finalvl);
      }
    }

    
}
