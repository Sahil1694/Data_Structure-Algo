public class LCSubstring {

   public static int longestCommonSubsequence(String t1 , String t2){
         int n = t1.length();
         int m = t2.length();
         int dp[][] = new int[n+1][m+1];

         for(int i = 0 ; i< n ; i++){
            dp[i][0] = 0;
         }
         for(int j = 0 ; j< m ; j++){
            dp[0][j] = 0;
         }
         int ans = 0;

         for(int i = 1 ; i < n+1;i++){
            for(int j = 1 ; j < m+1 ; j++){
                if(t1.charAt(i-1) == t2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    ans = Math.max(ans,dp[i][j]);
                }else{
                    dp[i][j] = 0;
                }
            }
         }
         return ans;

   }

    public static void main(String args[]){
        String str = "ABCDE";
        String str2 = "ABGCE";
        System.out.println(longestCommonSubsequence(str,str2));
    }
    
}
