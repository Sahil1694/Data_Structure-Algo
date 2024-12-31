import java.util.Arrays;
import java.util.HashSet;

public class LIS {

    public static int LCS(int arr1[] , int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int dp[][] = new int[n+1][m+1];

        for(int i = 0 ; i < n ; i++){
            dp[i][0] = 0;
        }
        for(int j = 0 ; j < m ; j++){
            dp[0][j] = 0;
        }

        for(int i = 1 ; i < n+1; i++){
            for(int j = 1 ; j< m+1; j++){
                if(arr1[i-1] == arr2[j-1]){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1,ans2);
                }
            }
        }
        return dp[n][m];
    }

    public static int LIS(int arr[]){
        HashSet<Integer> num = new HashSet<>();
        for(int i = 0 ; i < arr.length ; i++){
            num.add(arr[i]);
        }
        int arr2[] = new int[num.size()];
        int i = 0;
        for(int n : num){
             arr2[i] = n;
             i++;
        }
        Arrays.sort(arr2);//Ascending order
        int ans = LCS(arr , arr2);
        return ans;
    }


    public static void main(String args[]){
        int arr[] = {50 , 3 , 10, 7 , 40 , 80};

        System.out.println(LIS(arr));

    }
    
}