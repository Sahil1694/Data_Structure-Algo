import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int wt[] = {10, 20, 30};
        int W = 50;

        double ratio[][] = new double[val.length][2];
        for(int i = 0 ; i < val.length ; i++){
            ratio[i][0] = i;
            ratio[i][1] = (double)val[i]/wt[i];
        }

        Arrays.sort(ratio , Comparator.comparingDouble(o -> o[1]));

        int capcity = W;
        int finalValue = 0;
        for(int i = ratio.length - 1 ; i >= 0 ; i--){
           int index = (int)ratio[i][0];
           if(capcity >= wt[index]){
              finalValue += val[index];
              capcity -= wt[index];
        }else{
            finalValue += (ratio[i][1] * capcity);
            capcity = 0;
            break;
        }
    }
    System.out.println(finalValue);



    }
    
}
