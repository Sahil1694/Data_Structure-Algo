import java.util.*;

public class Arr {
    public static void update(int marks[]) {
        for(int i =0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    //linear Search
    public static void linear(int numbers[], int key){
        for(int i=0; i < numbers.length ; i++){
            if(numbers[i] == key){
                System.out.println("We found a Number");
            }
        }
    }

    //smallest and largest arrays {4,2,6,3,10,5}
    public static void smlLar(int numbers[]){
        int small = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i = 0 ; i < numbers.length; i++ ){
            if(small > numbers[i]){
                small = numbers[i];
            }
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        System.out.println(largest +"," +small);
    }


    //birnay search (sorted array ) {1,2,3,4,5}
    public static int bin(int numbers[], int key) {
        int start = 0 , end = numbers.length -1;

        while(start <= end){
            int mid = (start+end)/ 2;

            if(numbers[mid] == key ){
                return mid;
            }
            if(numbers[mid] < key ){
                start = mid +1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }


    //reverse array
    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length -1;

        while( first < last){
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }


     //Pairs {2,4,6} 2,4 /2,6/ 4,6
    public static void pairs(int numbers[]) {
        for(int i = 0; i < numbers.length ;i++){
            int curr =numbers[i];
            for(int j = i+1; j <numbers.length;j++){
                System.out.print("(" + curr +"," + numbers[j] + ")");
            }
            System.out.println();
        }
    }

    //Subarrays
    public static void subarray(int numbers[]){
        int ts = 0;
        for(int i = 0; i <numbers.length;i++){
            int start = i;
            for(int j =i;j<numbers.length;j++){
                int end = j;
                for(int k = start; k <= end ;k++ ){
                    System.out.print(numbers[k] + "  ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(ts);
    }

    //Max Subarray Brute Force
    public static void MaxSubarray(int numbers[]){
       int currsum = 0;
       int maxsum = Integer.MIN_VALUE;
       for(int i = 0; i < numbers.length; i++){
        int start = i;
        for(int j = i ; j <numbers.length ; j++){
            int end =j;
            currsum = 0;
            for(int k = start; k <=end;k++){
                currsum+= numbers[k];
            }
            // System.out.println(currsum);
            if(maxsum < currsum){
                maxsum = currsum;
            }
        }
       }
       System.out.println(maxsum);
    }

    //Max subarray Prefix array
    public static void MaxSubarrayPrefix(int numbers[]){
       int currsum = 0;
       int maxsum = Integer.MIN_VALUE;
       int prefix[] = new int[numbers.length];

       prefix[0] = numbers[0];
       //cal prefix array
       for(int i = 1; i < prefix.length; i++){
        prefix[i] = prefix[i-1] + numbers[i];
       }


       for(int i = 0; i < numbers.length; i++){
        int start = i;
        for(int j = i ; j <numbers.length ; j++){
            int end =j;
            currsum = 0;

            currsum = start == 0 ? prefix[end] :prefix[end] - prefix[start-1];
           
            }
            // System.out.println(currsum);
            if(maxsum < currsum){
                maxsum = currsum;
            }
         }
         System.out.println(maxsum);
       }
      
// max Subbarray Kadanes

public static void Kadanes(int numbers[]){
    int ms = Integer.MIN_VALUE;
    int cs = 0;
    for(int i = 0; i < numbers.length; i++){
        cs = cs+ numbers[i];
        if(cs < 0){
            cs = 0;
        }
        ms = Math.max(cs, ms);
    }
    System.out.println(ms);
}




//Detect repeating element
public static boolean Repeat(int numbers[]){
    for(int i =0; i < numbers.length; i++){
        for(int j = i+1; j <numbers.length;j++){
            if(numbers[i] == numbers[j]){
                return true;
            }
        }
    }
    return false;
}




    public static void main(String args[]) {

        try (Scanner scn = new Scanner(System.in)) {
        }

      int numbers[] = {3,1,2,3};
      
      System.out.println(Repeat(numbers));

    //   Kadanes(numbers);
      
    //   subarray(numbers);
      
      



        // int marks[]=new int[4];
        // marks[0] = scn.nextInt();
        // marks[1] = scn.nextInt();
        // marks[2] = scn.nextInt();
        // marks[3] = scn.nextInt();
        // System.out.println("phy"+ marks[0]);
        // System.out.println("phy"+ marks[1]);
        // System.out.println("phy"+ marks[2]);
        // System.out.println("phy"+ marks[3]);
       

// System.out.println(selectionSort(marks));
// System.out.println(marks);
    //    bubblesort(marks);
    //    printArr(marks);
//     //    sub(marks);
// System.out.println(marks.length);
// int a = 5;
// System.out.println(--a); 


//     //    int key = 99;
// System.out.print(reverse(numbers)); 
// reverse(marks);
// for(int i =0; i<marks.length; i++){
//     System.out.print(marks[i]+" ");
// }

    //    System.out.println(marks.length);

    //    System.out.println(bin(marks, 99));

    //    update(marks);
        
    //    for(int i = 0; i <marks.length;i++){
    //     System.out.print(marks[i]+ "  ");
    //    }
    //    System.out.println();



    }
}

