package Heaps;

import java.util.ArrayList;
import java.util.*;

public class InsertInHeap {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();


        public void add(int data){
            //add at last idx
            arr.add(data);
            int x = arr.size() - 1; //child idx
            int par = arr.size() -2 / 2; // parent idx

            while(arr.get(par) > arr.get(x)){
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int  i){
             int left = 2*i + 1;
             int right = 2*i + 2;
             int minIdx = i;

             if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = right;
             }

             if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
             }
             if(minIdx != i ){
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                 arr.set(minIdx, temp);

                heapify(minIdx);

             }


        }

        public int remove(){
            int data = arr.get(0);


            //step 1
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);


            //step 2 
            arr.remove(arr.size()-1);

            //step3 hepify
            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }

    public static void main(String args[]){

        Heap h = new Heap();

        h.add(4);
        h.add(1);
        h.add(2);
       h.add(5);


        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }




    }
    
}
