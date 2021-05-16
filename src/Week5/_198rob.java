package Week5;

public class _198rob {
    public int rob(int[] nums) {
//        //解法一
//        int n = nums.length;
//        int[][] dp = new int[n][n];
//        if(nums == null || n == 1) {
//            return nums[0];
//        }
//        dp[0][0] = 0;
//        dp[0][1] = nums[0];
//        for(int i=1 ; i< n;i++) {
//            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
//            dp[i][1] = dp[i-1][0] + nums[i];
//        }
//        return Math.max(dp[n-1][0], dp[n-1][1]);

        //解法二
        //存储变成一维数组
        if(nums.length == 1) {
            return nums[0];
        }
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i =2; i<n; i++) {
            dp[i] =Math.max(dp[i-2]+ nums[i], dp[i-1]);
        }
        return dp[n-1];
    }
}
