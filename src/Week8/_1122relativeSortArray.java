package Week8;

import java.util.*;

public class _1122relativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2)
    {
        //先将arr1中出现的与arr2中等值的元素交换到前列
        //**根据下标copy arr1剩下的数据
        //排序完成后返回给arr1
        int index = 0;
        int temp;
        for (int i = 0; i < arr2.length; i++)
        {
            for (int j = index; j < arr1.length; j++)
            {
                if (arr1[j] == arr2[i])
                {
                    temp = arr1[j];
                    arr1[j] = arr1[index];
                    arr1[index] = temp;
                    index++;
                }
            }
        }
        //赋值完毕,通过index复制
        int[] arr = Arrays.copyOfRange(arr1, index, arr1.length);
        Arrays.sort(arr);
        int count = index;
        //排序完毕,赋值回去
        for (int i = 0; i < arr.length; i++)
        {
            arr1[count] = arr[i];
            count++;
        }
        return arr1;
    }
}
