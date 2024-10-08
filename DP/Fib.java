public class Fib {


    public static int fibMemo(int n , int dp[]){
        if(n ==0 || n == 1){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] =  fibMemo(n-1 , dp) + fibMemo(n-2 , dp);
        return dp[n];
    }


    public static int fibonacci(int n){
        if(n ==0 || n == 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    

    public static void main(String[] args){
        int n = 5;
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        int ans = fibonacci(n);
        ans = fibMemo(n , dp);
        System.out.println(ans);
    }
    
}
