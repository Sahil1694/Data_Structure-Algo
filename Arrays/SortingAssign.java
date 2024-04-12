public class SortingAssign {


    public static void bubblesort(int arr[]){ //  9 8 7 4 1 
        for(int i = 0 ; i < arr.length -1 ; i++){
            for(int j = 0 ; j < arr.length - i - 1; j++){
                if(arr[j] <  arr[j+1]){
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j + 1 ] = temp;
                }
            }
        }
    }


public static void printArr(int arr[]){
    for(int i = 0; i < arr.length ; i++){
        System.out.print(arr[i] +" ");
    }
    System.out.println();
}

    public static void main(String args[]){
        int arr[] = {7,8,4,9,1,};
        bubblesort(arr);
        printArr(arr);

    }
}
