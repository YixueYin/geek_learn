package Week1;

public class getLeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        // //冒泡排序尝试
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=0;j<arr.length-1-i;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        //快排
        //需要递归调用
        quickSort(arr, 0, arr.length - 1);
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = arr[i];
        }
        return result;
    }
    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp就是基准位
        temp = arr[low];

        while (i<j) {
            //先看右边，依次往左递减
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);
    }
}
