package DP;

public class UniquePathsII_63 {
    public static int uniquePathsWithObstacles1(int[][] obstacleGrid){
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = 1;

        if (obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1)
            return 0;

        for (int i = 1; i < m; i++){
            if (obstacleGrid[i][0] == 1)
                dp[i][0] = 0;
            else
                dp[i][0] = dp[i-1][0];
        }

        for (int j = 1; j < n ; j++){
            if (obstacleGrid[0][j] == 1)
                dp[0][j] = 0;
            else
                dp[0][j] = dp[0][j-1];
        }

        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j++){
                if (obstacleGrid[i][j] == 1)
                    dp[i][j] = 0;
                else
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
    public static int uniquePathsWithObstacles2(int[][] obstacleGrid){
        int n = obstacleGrid[0].length;
        int[] dp = new int[n];
        dp[0] = 1;

        for (int[] row : obstacleGrid){
            for (int i = 0; i < n; i++){
                if (row[i] == 1)
                    dp[i] = 0;
                else if (i > 0)
                    dp[i] += dp[i-1];
            }
        }
        return dp[n-1];
    }
    public static void main(String[] args){
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles1(obstacleGrid));
        System.out.println(uniquePathsWithObstacles2(obstacleGrid));
    }
}
