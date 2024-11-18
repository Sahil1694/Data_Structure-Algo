public class RecKnapsack {

    public static int knapsack(int val[] , int wt[] , int w , int n){
        if(w ==0 || n ==0){
            return 0;
        }
        if(wt[n-1] <= w){//valid
            //include
            int ans1 = val[n-1] + knapsack(val , wt , w-wt[n-1],n-1);

            //exclude
            int ans2 = knapsack(val , wt , w , n-1);

            return Math.max(ans1 , ans2);
        }else{//not valid
            //exclude
            return knapsack(val , wt , w , n-1);
        }
    }
    public static int knapsackMemo(int val[] , int wt[] , int w , int n , int dp[][]){
        if(w ==0 || n ==0){
            return 0;
        }

        if(dp[n][w] != -1){
            return dp[n][w];
        }

        if(wt[n-1] <= w){//valid
            //include
            int ans1 = val[n-1] + knapsack(val , wt , w-wt[n-1],n-1);

            //exclude
            int ans2 = knapsack(val , wt , w , n-1);
            dp[n][w] = Math.max(ans1 , ans2);
            return dp[n][w];
        }else{//not valid
            //exclude
            dp[n][w] = knapsack(val , wt , w , n-1);
            return dp[n][w];
        }
    }

    public static int knapsackTab(int val[] , int wt[] , int W){
        int n = val.length;
        int dp[][] = new int[n+1][W+1];

        for(int i = 0 ; i < dp.length; i++){ 
            dp[i][0] = 0;
        }
        for(int i = 0 ; i < dp[0].length; i++){
            dp[0][i] = 0;
        }

        for(int i = 1 ; i < n+1 ; i++){
            for(int j = 1 ; j < W+1 ; j++){
                int v = val[i-1];//i-1 because val is 0 based   
                int w = wt[i-1];//i-1 because wt is 0 based
                if(w <= j){//Valid
                   int incProfit = v + dp[i-1][j-w];
                   int excProfit = dp[i-1][j];
                  dp[i][j] = Math.max(incProfit , excProfit);
                }else{//Not valid
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;
                }
               
            }
        }
        return dp[n][W];
    }


    public static void main(String[] args) {
        int val[] = {15, 14, 10 , 45 , 30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        int dp[][] = new int[val.length+1][W+1];

        for(int i = 0 ; i < val.length+1 ; i++){
            for(int j = 0 ; j < W+1 ; j++){
                dp[i][j] = -1;
            }
        }

        // System.out.println(knapsackMemo(val , wt , W , val.length , dp));
        System.out.println(knapsackTab(val , wt , W));

    }
    
}
