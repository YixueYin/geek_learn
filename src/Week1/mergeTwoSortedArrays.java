package Week1;

public class mergeTwoSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //2. 从后往前更新数组
        //定义三个指针
        int i = m-1;
        int j = m+n-1;
        int k = n-1;
        while(i>=0 && k>=0) {
            //如果尚有需要比较的元素
            if(nums2[k] >= nums1[i]) {
                nums1[j] = nums2[k];
                j--;
                k--;
            }else {
                nums1[j] = nums1[i];
                i--;
                j--;
            }
        }
        System.arraycopy(nums2, 0, nums1, 0, k+1);
        // //1. 合并后排序
        // System.arraycopy(nums2, 0, nums1, m, n);
        // Arrays.sort(nums1);
        // //时间过长
    }
}
