import java.util.*;

public class Sorting {


//Bubble Sort
    public static void bubblesort(int arr[]) {
        for (int turns = 0; turns< arr.length -1; turns++){
            for(int j =0; j < arr.length - turns - 1; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }  
    }

//selection Sort      5 2 3 1 
    public static void selectionSort(int arr[]) {
        for (int i =0 ; i < arr.length;i++){
            int minpos =i;
            for(int j = i+1; j < arr.length;j++){
                if(arr[minpos] > arr[j]){
                    minpos=j;
                }
            }
            //swap
            int temp = arr[minpos];
            arr [minpos] = arr[i];
            arr[i] = temp;
        }
    }

//Insertion Sort
public static void Insertion(int arr[]){
    for(int i = 1; i < arr.length;i++){
        int curr = arr[i];
        int prev = i-1;
        //finding out correct pos
        while(prev >=0 && arr[prev] > curr){
            arr[prev+1] = arr[prev];
            prev--;
        }
        //Insertion
        arr[prev+1] =curr;
    }
}

//Inbuit Sort
public static void Inbuit(int arr[]){
    Arrays.sort(arr);
}

//Counting sort
public static void CountingSort(int arr[]){
    int largest = Integer.MIN_VALUE;
    for(int i = 0; i <arr.length ; i++){
        largest = Math.max(largest, arr[i]);
    }
    int count[] = new int[largest+1];
    for(int i = 0; i< arr.length; i++){
        count[arr[i]]++;
    }

    //sorting
    int j = 0;
    for(int i = 0; i <count.length; i++){
        while(count[i] > 0){
            arr[j] = i;
            j++;
            count[i]--;
        }
    }
}

//To print a array.
    public static void printArr(int arr[]) {

        for(int i = 0 ; i <arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();   
    }
    
public static void main(String args[]) {
    int arr[] = {2,3,1};
   
    // bubblesort(arr);
    //  Inbuit(arr);
    // Insertion(arr);
    // CountingSort(arr);
    printArr(arr);
}    
}
