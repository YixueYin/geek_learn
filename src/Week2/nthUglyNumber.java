package Week2;

public class nthUglyNumber {
    class Solution {
        public int nthUglyNumber(int n) {
            //1. 动态规划， 非常巧妙的解法
            int[] dp = new int[n];
            dp[0] = 1;
            int a = 0, b = 0, c = 0;
            for(int i =1; i< n;i++) {
                dp[i] = Math.min(Math.min(dp[a]*2, dp[b]*3) , dp[c]*5);
                if (dp[a]*2 == dp[i]) a+=1;
                if (dp[b]*3 == dp[i]) b+=1;
                if (dp[c]*5 == dp[i]) c+=1;
            }
            return dp[n-1];
        }
    }
//2. 用小根堆解决，但是时间复杂度太高了
// class Solution {
//     private int[] uglyNumber = {2,3,5};
//     public int nthUglyNumber(int n) {
//         Set<Long> set = new HashSet<>();
//         //创建小根堆，每次出堆的都是最小值
//         PriorityQueue<Long> queue = new PriorityQueue<>();
//         queue.add(1L);
//         //记录出堆的个数，出堆的元素完全按照从小到大排序
//         int count = 0;
//         while (! queue.isEmpty()){
//             long cut = queue.poll();

//             //如果出堆的个数>=n,当前cut就是第n个丑数
//             if(++count >= n){
//                 return (int) cut;
//             }
//             for(int num : uglyNumber){
//                 //排除重复的数字
//                 if(! set.contains(num * cut)){
//                     queue.add(num * cut);
//                     set.add(num * cut);
//                 }
//             }
//         }
//         return -1;
//     }
// }

}
