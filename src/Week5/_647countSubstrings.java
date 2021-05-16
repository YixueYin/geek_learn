package Week5;

public class _647countSubstrings {
    public int countSubstrings(String s) {
        //动态规划
        //定义状态：dp[i][j]表示的是字符串s从i到j的这段子字符串是否是回文串
        boolean[][] dp = new boolean[s.length()][s.length()];
        if(s== null){
            return 0;
        }
        int ans = 0;
        dp[0][0] = true;
        int n = s.length();
        for(int j = 0; j < n;j++) {
            for(int i = 0; i<= j; i++) {
                if(s.charAt(i) == s.charAt(j) && ( j-i<2 || dp[i+1][j-1])){
                    dp[i][j] = true;
                    ans++;
                }
            }
        }
        return ans;
    }
}
