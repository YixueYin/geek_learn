package Week4;

public class _367isPerfectSquare {
    public boolean isPerfectSquare(int num) {
        //2. 牛顿迭代法
        if(num < 2) {
            return true;
        }
        long x = num;
        while(x * x > num) {
            x = (x+ num/x)/2;
        }
        return (x*x)== num;


        // if(num < 2) {
        //     return true;
        // }
        // //1 二分查找
        // long left = 0;
        // long right = num/2;
        // while(left <= right) {
        //     long mid = left + (right - left)/2;
        //     if(mid * mid == num) {
        //         return true;
        //     }
        //     // if(right * right == num) {
        //     //     return true;
        //     // }
        //     // if(left * left == num) {
        //     //     return true;
        //     // }
        //     if(mid * mid <= num) {
        //         left = mid+1;
        //     }else{
        //         right = mid-1;
        //     }
        // }
        // return false;
    }
}
