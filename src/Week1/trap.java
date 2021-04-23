package Week1;

class Solution {
    public int trap(int[] height) {
        // //1. 暴力解法
//         int ans = 0;
//         for(int i=0; i<height.length;i++) {
//             int left = i;
//             int right = i;
//             int leftMax = height[i];
//             int rightMax = height[i];
//             //向左扩散
//             for(int j = 0; j<left;j++) {
//                 leftMax = Math.max(height[j], leftMax);
//             }
//             //向右扩散
//             for(int j = right; j<height.length;j++) {
//                 rightMax = Math.max(height[j], rightMax);
//             }
//             ans = ans + Math.min(leftMax, rightMax)-height[i];
//         }
//         return ans;
        //2. 使用动态规划
        //先求一遍对于当前的每一个i，左最高边界和右最高边界分别是多少
        //这样可以避免两层循环
        if(height == null || height.length==0) {
            return 0;
        }
        int ans = 0;
        int n = height.length;
        int[] right_max = new int[n];
        int[] left_max = new int[n];
        left_max[0] = height[0];
        for(int i=1;i<n;i++) {
            left_max[i] = Math.max(left_max[i-1], height[i]);
        }
        right_max[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--) {
            right_max[i] = Math.max(right_max[i+1],height[i]);
        }
        for(int i=1; i<height.length-1;i++) {
            ans = ans + Math.min(left_max[i], right_max[i])-height[i];
        }
        return ans;
    }
}

