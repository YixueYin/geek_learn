package Week4;

import java.util.Arrays;

public class _455findContentChildren {
    public int findContentChildren(int[] g, int[] s) {
        //简单排序
        //一次通过，yeah
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int p1 = 0;
        int p2 = 0;
        while(p1 < g.length && p2 < s.length) {
            if(g[p1] <= s[p2]) {
                count++;
                p1++;
                p2++;
            }else {
                p2++;
            }
        }
        return count;
    }
}
