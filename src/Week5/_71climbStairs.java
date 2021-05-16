package Week5;

public class _71climbStairs {
    public int climbStairs(int n) {
        //2. 递归
        // if(n == 1 || n == 2) {
        //     return n;
        // }
        // return climbStairs(n-1) + climbStairs(n-2);
        //超出时间限制

        //3. 动态规划1.0
        int[] res = new int[n+1];
        if(n == 1 || n == 2) {
            return n;
        }
        res[1] = 1;
        res[2] = 2;
        for(int i = 3;i<n+1;i++) {
            res[i] = res[i-1]+res[i-2];
        }
        return res[n];

        //1. 动态规划2.0 ，空间复杂度为O（1）
        // if(n==1) {
        //     return 1;
        // }
        // int first = 1;
        // int second = 2;
        // int third = 3;
        // for(int i = 3;i<=n;i++){
        //     third = first+second;
        //     first=second;
        //     second = third;
        // }
        // return second;
    }
}
