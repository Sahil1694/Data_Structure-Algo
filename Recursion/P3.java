package Recursion;

public class P3 {
    public static int fact(int n) {
        if(n==0){
            return 1;
        }
        int f = fact(n-1);
        int fn = f*n;
        return fn;      
    }
    public static void main(String args[]) {
      System.out.println(  fact(4));
        
    }
    
}
 