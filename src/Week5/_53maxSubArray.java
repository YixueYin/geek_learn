package Week5;

public class _53maxSubArray {
    public int maxSubArray(int[] nums) {
        //1 动态规划
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = nums[0];
        for(int i= 1; i< nums.length; i++) {
            dp[i] = Math.max(0, dp[i-1]) + nums[i];
            res = Math.max(dp[i], res);
        }
        return res;


        // int ans = nums[0];
        // int sum = 0;
        // for(int num: nums) {
        //     if (sum > 0) {
        //         sum += num;
        //     }else {
        //         sum = num;
        //     }
        //     ans = Math.max(ans, sum);
        // }
        // return ans;
    }
}
