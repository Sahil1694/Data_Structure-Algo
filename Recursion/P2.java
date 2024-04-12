package Recursion;

public class P2 {
    public static void printIns(int n) {
        if(n==1){
            System.out.print(n + " " );
            return;
        }
        printIns(n-1);
        System.out.print(n+" ");
       } 
    
    public static void main(String args[]) {
        int n = 10;
        printIns(n); 


        
    }
    
}
