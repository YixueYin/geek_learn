package Week4;
//153 寻找旋转排序数组的最小值
public class _153findMin {
    public int findMin(int[] nums) {
        //1.暴力直接
        // Arrays.sort(nums);
        // return nums[0];
        //2.找出旋转的那个元素
        // int count = -1;
        // for(int i = 0; i<nums.length-1; i++) {
        //     if(nums[i] > nums[i+1]) {
        //         count = i+1;
        //         break;
        //     }
        // }
        // if(count == -1) {
        //     return nums[0];
        // }else {
        //     return nums[count];
        // }
        //3. 二分查找

        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (nums[pivot] < nums[high]) {
                high = pivot;
            } else {
                low = pivot + 1;
            }
        }
        return nums[low];
    }
}
