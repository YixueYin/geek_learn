package Week8;

public class _231isPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n == 0) return false;
        while(n%2 == 0) {
            n = n>>1;
        }
        return n == 1;
    }
}
