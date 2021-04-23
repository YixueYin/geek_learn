package Week1;

public class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        //考虑双指针
        if(nums.length == 0) return 0;
        int pre = 0;
        int cur = 1;
        while(cur<nums.length) {
            if(nums[pre] == nums[cur]) {
                cur++;
            }else {
                nums[pre+1] = nums[cur];
                pre++;
                cur++;
            }
        }
        return pre+1;
    }
}
