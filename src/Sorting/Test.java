package Sorting;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] test = {1,5,3,6,2,3,7,23,75,34,56,77,234};
//        bubbleSort(test);
//        Arrays.sort(test);
//        selectionSort(test);
//        insertionSort(test);
//        ShellSort(test);

        printArray(QuickSort(test, 0, test.length-1));
//        printArray(MergeSort(test));
        long start,end;
        start = System.currentTimeMillis();
        for (int i = 0; i < 2000000000; i++) {}
        end = System.currentTimeMillis();
        System.out.println("Run Time:" + (end - start) + "(ms)");
    }

    /**
     * 快速排序方法
     * @param array
     * @param start
     * @param end
     * @return
     */
    public static int[] QuickSort(int[] array, int start, int end) {
        if (array.length < 1 || start < 0 || end >= array.length || start > end) return null;
        int smallIndex = partition(array, start, end);
        if (smallIndex > start)
            QuickSort(array, start, smallIndex - 1);
        if (smallIndex < end)
            QuickSort(array, smallIndex + 1, end);
        return array;
    }
    /**
     * 快速排序算法——partition
     * @param array
     * @param start
     * @param end
     * @return
     */
    public static int partition(int[] array, int start, int end) {
        int pivot = (int) (start + Math.random() * (end - start + 1));
        int smallIndex = start - 1;
        swap(array, pivot, end);
        for (int i = start; i <= end; i++)
            if (array[i] <= array[end]) {
                smallIndex++;
                if (i > smallIndex)
                    swap(array, i, smallIndex);
            }
        return smallIndex;
    }

    /**
     * 交换数组内两个元素
     * @param array
     * @param i
     * @param j
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }



    /**
     * MergeSort归并排序，递归
     * @param test
     */
    private static int[] MergeSort(int[] test) {
        if(test.length < 2) return test;
        int mid = test.length / 2;
        int[] left = Arrays.copyOfRange(test, 0, mid);
        int[] right = Arrays.copyOfRange(test, mid, test.length);
        return merge(MergeSort(left), MergeSort(right));
    }

    /**
     * 归并排序——将两段排序好的数组结合成一个排序数组
     * @param left
     * @param right
     * @return
     */
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length)
                result[index] = right[j++];
            else if (j >= right.length)
                result[index] = left[i++];
            else if (left[i] > right[j])
                result[index] = right[j++];
            else
                result[index] = left[i++];
        }
        return result;
    }

    /**
     * ShellSort 希尔排序，是插入排序的变种
     * 引入了"增量"这个概念，通常取length/2
     * @param test
     */
    private static void ShellSort(int[] test) {
        int len = test.length;
        int temp, gap = len/2;
        while(gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = test[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && test[preIndex] > temp) {
                    test[preIndex + gap] = test[preIndex];
                    preIndex -= gap;
                }
                test[preIndex + gap] = temp;
            }
            gap /= 2;
        }
    }

    /**
     * insertionSort插入排序
     * @param test
     */
    private static void insertionSort(int[] test) {
        if(test.length == 0) {
            return;
        }
        int current;
        //默认第一个元素已经排序，把下一个元素拿出来，遍历已经排序的数组将这个下一个元素插入
        for(int i = 0; i< test.length-1; i++) {
            current = test[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < test[preIndex]) {
                test[preIndex + 1] = test[preIndex];
                preIndex--;
            }
            test[preIndex + 1] = current;
        }
    }

    /**
     * selectionSort选择排序
     * @param test
     */
    //将数组分为"已经排好的前段"和"尚未排序的后段"
    private static void selectionSort(int[] test) {
        if (test.length == 0) {
            return;
        }
        for(int i = 0; i<test.length;i++) {
            int minIndex = i;
            for(int j = i;j< test.length; j++) {
                if(test[j] < test[minIndex]) {//找到最小的数
                    minIndex = j;
                }
            }
            int temp = test[minIndex];
            test[minIndex] = test[i];
            test[i] = temp;
        }
    }

    /**
     * bubbleSort冒泡排序
     * @param test
     */
    //时间复杂度为O（n^2）,很好理解，直接背下来会比较好
    private static void bubbleSort(int[] test) {
        //例行的异常判断
        if(test.length == 0) {
            return;
        }
        //外层排序控制排序趟数
        //内层排序控制每一趟排序多少次
        for(int i=0;i<test.length;i++) {
            for (int j = 0; j < test.length - i - 1; j++) {
                if (test[j] > test[j + 1]) {
                    int temp = test[j];
                    test[j] = test[j + 1];
                    test[j + 1] = temp;
                }
            }
        }
    }

    private static void printArray(int[] test) {
        System.out.print("The sorted array is: ");
        for (int j : test) {
            System.out.print(j + " ");
        }
    }
}
