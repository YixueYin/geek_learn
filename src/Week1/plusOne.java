package Week1;

public class plusOne {
    public int[] plusOne(int[] digits) {
        //分三种情况讨论
        //1. 像45这种，只需要在末尾加一
        //2. 像2589这种，进位在中间停止
        //3. 像1999这种，需要在首项也进位
        for(int i = digits.length-1;i>=0;i--) {
            digits[i]++;
            if(digits[i]%10 !=0) {

                return digits;
            }else {
                digits[i] = 0;
            }
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
}
