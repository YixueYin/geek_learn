package Week4;

public class _322coinChange {
    public int coinChange(int[] coins, int amount) {
        //动态规划 第二遍
        int n = coins.length;
        int[] dp = new int[amount+1];
        dp[0] = 0;
        for(int i=1;i<=amount;i++) {
            dp[i] = Integer.MAX_VALUE;
            for(int j = 0;j<n;j++) {
                if(i>=coins[j] && dp[i-coins[j]] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i-coins[j]]+1,dp[i]);
                }
            }
        }
        if(dp[amount] == Integer.MAX_VALUE)
            dp[amount] = -1;
        return dp[amount];
    }





//动态规划
// int[] dp = new int[amount+1];
// int n = coins.length;
// dp[0] = 0;
// for(int i = 1;i<=amount;i++){
//     dp[i] = Integer.MAX_VALUE;
//     for(int j = 0;j<n;j++){
//         if(i>=coins[j] && dp[i-coins[j]]!=Integer.MAX_VALUE){
//             dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
//         }
//     }
// }
// if(dp[amount] == Integer.MAX_VALUE)
// dp[amount] = -1;
// return dp[amount];
}
