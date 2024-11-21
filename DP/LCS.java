public class LCS {

    public static int LCS(String str1 , String str2 ,int  n ,int m){
        if(n == 0 || m == 0){       //Base case
            return 0;
        }
        else if(str1.charAt(n-1) == str2.charAt(m-1)){//Same character
            return LCS(str1, str2 , n-1,m-1) +1;
        }else{//Different character
            int ans1 = LCS(str1,str2,n-1,m);
            int ans2 = LCS(str1,str2,n,m-1);
            return Math.max(ans1, ans2);
        }
    }

    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedg";
        System.out.println(LCS(str1, str2 , str1.length(), str2.length()));
    }
    
}