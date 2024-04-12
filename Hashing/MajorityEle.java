package Hashing;
import java.util.*;

public class MajorityEle {
    public static void main (String[]args){
        int arr[] = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer, Integer> hp = new HashMap<>();
        

        for(int i = 0 ; i < arr.length ; i++){
            int nums = arr[i];

            if(hp.containsKey(nums)){
                hp.put(nums, hp.get(nums) + 1);
            }else{
                hp.put(nums, 1);
            }
        }

        Set<Integer> keySet = hp.keySet();
        for (Integer key : keySet) {
            if(hp.get(key) > arr.length/3){
                System.out.println(key);
            }
            
        }



    }
    
}
