package Greedy.Greedy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinDiff {

    public static void main(String args[]) {

        int A[] = {4,1,8,7};
        int B[] = {2,3,6,5};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDff = 0;

        for(int i = 0 ; i <A.length; i++){
            minDff += Math.abs(A[i] - B[i]);
        }

        System.out.println(minDff);


        
    }
    
}
