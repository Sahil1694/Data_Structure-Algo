package Recursion;

// import javax.sql.rowset.spi.XmlReader;

public class P9 {
    public static int power(int x, int n) {
        if(n == 0){
            return 1;
        }
        int xm1 = power(x, n-1);
        int xn = x * xm1;
        return xn;
    }


    
    public static int Optimized(int x, int n) {
        if(n ==0){
            return 1;
        }
        int halfPowerSq = Optimized(x, n/2) * Optimized(x, n/2);

        if(n%2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;

        
    }
        public static void main(String args[]) {

            System.out.println(power(2, 5));
            System.out.println(Optimized(5, 2));
          
        
        
    }
    
}
