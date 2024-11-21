public class RodCutting {

    //weight[] = length[] , value[] = price[] , W = totalRod
    public static int RodCutting(int length[] , int price[] , int totalRod){
        int n = price.length;
        int dp[][] = new int[n+1][totalRod+1];
        

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < totalRod+1;j++){
                int weight = length[i-1];
                int value = price[i-1];
                //include
                if(weight <= j){
                    dp[i][j] = Math.max(value + dp[i][j-weight] , dp[i-1][j]);
                }
                //exclude
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][totalRod];
    }

    public static void main(String[] args) {
        int length[] = {1,2,3,4,5,6,7,8};
        int price[] = {1,5,8,9,10,17,17,20};
        int n = 8;

        System.out.println(RodCutting(length, price, n));
    }
    
}
