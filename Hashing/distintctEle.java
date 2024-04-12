package Hashing;
import java.util.*;

public class distintctEle {

    public static void main(String args[]){
       int num [] = {4,3,2,5,6,7,3,4,2,1};
       HashSet <Integer> set = new HashSet<>();

       for(int i = 0; i < num.length; i++){
        set.add(num[i]);
       }
    //    System.out.println(set.size());

       //intersection of two arr
    //    int arr1[] = {7,3,9};
    //     int arr2[] = {6,3,9,2,9,4};
    //     HashSet <Integer> sets = new HashSet<>();

    //     for(int i = 0 ; i < arr1.length ; i++){
    //         sets.add(arr1[i]);
    //     }
    //     int count = 0;
    //     for(int i = 0 ; i < arr2.length ; i++){
    //         if(sets.contains(arr2[i])){
    //             count++;
    //             sets.remove(arr2[i]);
    //         }
    //     }

        // System.out.println(count);
    }
    
}
