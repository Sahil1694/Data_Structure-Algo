package Arraylist; 
import java.util.*;

public class basics {
    //Swap  2 Numbers
    public static void swap(ArrayList <Integer> list , int idx1 , int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);  
    }

    //Most Water
     //brute force
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
       
        for(int i = 0; i <height.size(); i++){
            for(int j = i+ 1; j < height.size(); j++){
                int ht = Math.min(height.get(i), height.get(j));
                int wi = j-1;
                int currWater = ht * wi;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }
    
    //2 pointer approach 
    public static int storeWater2(ArrayList<Integer> height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() -1;

        while(lp < rp){
            //cal area
            int ht = Math.min(height.get(rp), height.get(lp));
            int Wt = rp - lp;
            int currWater = ht*Wt;
            maxWater = Math.max(maxWater, currWater);

            //update ptr
            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
//Pair Sum
// Brute Force
    public static void PairSum(ArrayList<Integer>height, int key){
        for(int i = 0; i < height.size(); i++){
            for(int j = 1 + i; j < height.size(); j++){
                  if(height.get(i) + height.get(j) == key){
                    System.out.println("true");
                  }
            }
        }
       System.out.println("false");
    }

    //2 Pointer Approach 

    public static boolean PairSum1(ArrayList<Integer>height, int key){
        int lp = 0;
        int rp = height.size() -1;
        while( lp != rp){
            //case 1
            if(height.get(lp) + height.get(rp) == key){
                return true;
            }else if(height.get(lp) + height.get(rp) < key){
                lp++;
            }else if(height.get(lp) + height.get(rp) > key){
                rp--;
            }
        }
        return false;
    }

    public static void main(String args[]) {

        // Most Water
        ArrayList <Integer> height = new ArrayList<>();
        height.add(1);
        height.add(3);
        height.add(2);
        height.add(3);
        System.out.println("MaxWater" +storeWater2(height));


        System.out.println(PairSum1(height, 50));
        
        


        //multidimentional arraylist
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        mainList.add(list1);


        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(3);list4.add(4);
        mainList.add(list4);

         //printing multidimentional array 
        for(int i = 0 ; i <mainList.size() ; i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j = 0; j <currList.size() ; j++ ){
                System.out.print(currList.get(j) + "   ");
            }
            System.out.println();
        }
        //types
        //classNmae objectNmae = new Classname();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        //operation
        //1.addd 
        list.add(1000);
        list.add(20);
        list.add(0);

        //sorting 
        //ascesnding
        Collections.sort(list);
        System.out.println("Sorted" + list);

        //descending
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Reverse" + list);

        //swap
        int idx1 = 1 , idx2 = 2;
        swap(list, idx1, idx2);
        System.out.println( "swap"  + list);

         //print the arraylist
         for(int i = 0 ; i <list.size();i++){
            System.out.print(list.get(i) + "  ");
        }
        
         // reverse arraylist 
         for(int i = list.size() - 1 ; i >= 0; i--){
            System.out.print(list.get(i) +  " ");
        }
        System.out.println();

        //find MAx
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < list.size(); i++){
            if(max < list.get(i)){
                max = list.get(i);
                // max = Math.max(max, list.get(i))
            }
        }
        System.out.println("max element" + max);

        //2.get
        int el = list.get(2);
        System.out.println(el);

        //set
        list.set(2, 10);
        System.out.println(list);

        //contains
        System.out.println(list.contains(50));


       



         
        
    }
    
} 
