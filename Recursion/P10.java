package Recursion;

public class P10 {


    public static int  tilingProb(int n) { // 2 * n (floor size)
        //base case
        if(n==0 || n ==1){
            return 1;
        }
        //kaam
        //vertival choice
        int fnm1 = tilingProb(n -1);

        //horizontal 
        int fm2 = tilingProb(n -2);

        int totalWays = fnm1 + fm2;
        return totalWays;        
    }

public static int  Ntimes(int i) {
    if(i==0){
        return 0;
    }
    int  su = Ntimes(i-1);
     int sum = i +su;
    return sum;
    
    
}

    public static void main(String args[]) {

        System.out.println(tilingProb(100));
      
    //   System.out.println(Ntimes(10));    
    
    }

}
