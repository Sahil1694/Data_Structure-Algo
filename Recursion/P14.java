package Recursion;

public class P14 {

    public static int friendspair(int n){
        if(n==1 || n == 2){

            return n;
        }


        //single
        int fm1 = friendspair(n-1);

        //pair
        int fm2 = friendspair(n-2);
        int pairways = (n-1) * fm2;

        //totalways
        return fm1 +pairways;
        
    }

    public static void main(String args[]) {
        System.out.println( friendspair(3));
        
    }
    
}
