package Week4;

public class _55canJump {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int l = nums.length;
        for(int i =0; i<l;i++) {
            System.out.println(canJump(nums)[i]);
        }
    }
    public static boolean[] canJump(int[] nums) {
        //1. 递归 超出时间限制
        //     if(nums==null || nums.length==0) {
        //         return true;
        //     }
        //     return dfs(0,nums);
        // }

        // private boolean dfs(int index, int[] nums) {
        //     //递归的终止条件
        //     if(index>=nums.length-1) {
        //         return true;
        //     }
        //     //根据nums[index]表示要循环多少次，index是当前我们能到达的位置，
        //     //在这个基础上有 index+1，index+2.... index+i种跳跃选择
        //     for(int i=1;i<=nums[index];++i) {
        //         if(dfs(i+index,nums)) {
        //             return true;
        //         }
        //     }
        //     return false;

        //2. 动态规划
        //也不知道是不是严格的动规
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        for(int i = 0;i<nums.length;i++) {
            for(int j = 0; j<=nums[i];j++) {
                if(dp[i] && i+j <= nums.length-1) {
                    dp[i+j] = true;
                }
            }
        }
        return dp;
        //3. 贪心算法
        //3.1 从前往后维护一个rightmost边界
        // int rightmost = 0;
        // int n = nums.length;
        // for(int i=0; i<n; i++) {
        //     if(i<=rightmost) {
        //         rightmost = Math.max(rightmost, i + nums[i]);
        //         if(rightmost >= n-1) {
        //             return true;
        //         }
        //     }
        // }
        // return false;
        //3.2 从后往前贪心查找
        // int endReachable = nums.length-1;
        // for(int i = nums.length-1; i>= 0;i--) {
        //     if(nums[i]+i>=endReachable) {
        //         endReachable = i;
        //     }
        // }
        // return endReachable == 0;
    }
}
