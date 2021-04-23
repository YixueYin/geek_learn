package Week1;

public class moveZeroes {
    public void moveZeroes(int[] nums) {
        //一层循环
        int j=0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i]!=0) {
                int temp=nums[i];
                nums[i] = nums[j];
                nums[j] =temp;
                j++;
            }
        }
    }
}
