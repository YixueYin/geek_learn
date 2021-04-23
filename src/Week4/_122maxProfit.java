package Week4;

public class _122maxProfit {
    public int maxProfit(int[] prices) {
        //1. 贪心算法：直觉
        //但是感觉比较玄学
        //这种只考虑如果股票差价是正数，那么就相加
        int length = prices.length;
        if(length<2) {
            return 0;
        }
        int res = 0;
        for(int i = 1; i<length;i++) {
            res += Math.max(prices[i] - prices[i-1], 0);
        }
        return res;
    }
}
