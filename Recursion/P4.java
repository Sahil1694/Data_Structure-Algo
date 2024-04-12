package Recursion;

public class P4 {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int s = sum(n-1);
        int su = n + s;
        return su;
    }
    public static void main(String args[]) {
        System.out.println(sum(10));
    }
    
}
