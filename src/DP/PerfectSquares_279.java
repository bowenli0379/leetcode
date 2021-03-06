package DP;

public class PerfectSquares_279 {
    public static int numSquares(int n){
        int[] dp = new int[n+1];
        for (int i = 1; i <= n; i++){
            dp[i] = i;
            for (int j = 1; j*j <= i; j++){
                dp[i] = Math.min(dp[i-j*j]+1,dp[i]);
            }
        }
        return dp[n];
    }
    public static void main(String[] args){
        int n = 13;
        System.out.println(numSquares(n));
    }
}
