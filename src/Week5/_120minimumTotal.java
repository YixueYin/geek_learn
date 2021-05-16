package Week5;

import java.util.List;

public class _120minimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        // //动态规划 二维数组
        // int row = triangle.size();
        // int[][] dp = new int[row+1][row+1];
        // for(int i = row-1; i >= 0 ; i--) {
        //     for(int j = 0; j < triangle.get(i).size() ; j++) {
        //         dp[i][j] = Math.min(dp[i+1][j], dp[i+1][j+1]) + triangle.get(i).get(j);
        //     }
        // }
        // return dp[0][0];
        //空间优化
        // int n = triangle.size();
        // int[] dp = new int[n + 1];
        // for (int i = n - 1; i >= 0; i--) {
        //     for (int j = 0; j <= i; j++) {
        //         dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
        //     }
        // }
        // return dp[0];
        int n = triangle.size();
        int[] dp = new int[n+1];
        for(int i = n-1; i>= 0; i--) {
            for(int j = 0; j<=i; j++) {
                dp[j] = Math.min(dp[j], dp[j+1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
}
