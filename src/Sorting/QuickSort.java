package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 7, 3, 1, 6, 9, 4};
        quickSort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }

    /**
     *
     * @param arr           待排序列
     * @param leftIndex     待排序列起始位置
     * @param rightIndex    待排序列结束位置
     */
    public static void quickSort(int[] arr, int leftIndex, int rightIndex) {
        if(leftIndex > rightIndex) {
            return;
        }
        int left = leftIndex;
        int right = rightIndex;
        //待排序的第一个元素作为基准值
        int key = arr[left];

        //从左右两边交替扫描，直到left==right
        while(left < right) {
            while(left < right && arr[right] >= key) {
                right--;
            }
            arr[left] = arr[right];

            while (left < right && arr[left] <= key) {
                left++;
            }
            arr[right] = arr[left];
        }
        //基准值归位
        arr[left] = key;
        quickSort(arr, leftIndex, left-1);
        quickSort(arr, right+1, rightIndex);
    }
}
