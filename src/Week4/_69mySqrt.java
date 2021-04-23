package Week4;

public class _69mySqrt {
    public int mySqrt(int x) {
        // //二分查找
        // long left = 1;
        // long right = x;
        // long mid = 0
        // while(left <= right) {
        //     mid = left+(right-left)/2;
        //     if(mid * mid <= x) {
        //         left = mid+1;
        //     }else {
        //         right = mid-1;
        //     }
        // }
        // return (int)right;

        //2. 牛顿迭代法 牛顿永远的神
        if(x == 0) {
            return 0;
        }
        long r = x;
        // while(true) {
        //     double xi = (x0 + C/x0)/2;
        //     if(Math.abs(x0-xi)<1e-7) {
        //         break;
        //     }
        //     x0 = xi;
        // }
        while(r * r > x) {
            r = (r+x/r)/2;
        }
        return (int)r;
    }
}
