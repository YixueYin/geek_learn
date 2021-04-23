package Week2;

import java.util.Arrays;
import java.util.PriorityQueue;

class Solution5 {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] ans = new int[k];
        for(int i=0; i<k;i++) {
            ans[i] = arr[i];
        }
        return ans;
//        //3. 新方法，使用JAVA自带的二叉堆的实现
//        //默认priority_queue实现的是小根堆
//        PriorityQueue<Integer> heap = new PriorityQueue<>();
//        for(int i=0;i<arr.length;i++) {
//            heap.add(arr[i]);
//        }
//        int[] res = new int[k];
//        for(int i=0;i<k;i++) {
//            res[i] = heap.poll();
//        }
//        return res;
        // //1. 冒泡排序尝试
        //超出时间限制
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=0;j<arr.length-1-i;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        //2. 快排
        //需要递归调用
        //或者可以直接调用Arrays.sort方法
        //     quickSort(arr, 0, arr.length - 1);
        //     int[] result = new int[k];
        //     for(int i=0;i<k;i++){
        //         result[i] = arr[i];
        //     }
        //     return result;
        // }
        // public static void quickSort(int[] arr,int low,int high){
        //     int i,j,temp,t;
        //     if(low>high){
        //         return;
        //     }
        //     i=low;
        //     j=high;
        //     //temp就是基准位
        //     temp = arr[low];

        //     while (i<j) {
        //         //先看右边，依次往左递减
        //         while (temp<=arr[j]&&i<j) {
        //             j--;
        //         }
        //         //再看左边，依次往右递增
        //         while (temp>=arr[i]&&i<j) {
        //             i++;
        //         }
        //         //如果满足条件则交换
        //         if (i<j) {
        //             t = arr[j];
        //             arr[j] = arr[i];
        //             arr[i] = t;
        //         }

        //     }
        //     //最后将基准为与i和j相等位置的数字交换
        //      arr[low] = arr[i];
        //      arr[i] = temp;
        //     //递归调用左半数组
        //     quickSort(arr, low, j-1);
        //     //递归调用右半数组
        //     quickSort(arr, j+1, high);
        // }

    }
}