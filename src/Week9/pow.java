package Week9;

public class pow {
    public static double myPow(double x, int n) {
        double result = 1;
        double base = x;
        while(n!=0) {
            //如果幂的二进制最后一位是1
            if((n&1) == 1) {
                result = result * base;
            }
            base = base * base;
            n = n>>1;
        }
        return result;
    }
}
