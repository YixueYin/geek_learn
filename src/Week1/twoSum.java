package Week1;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        //1.遍历
        // int[] res = new int[2];
        // for(int i=0; i<nums.length;i++) {
        //     for(int j=nums.length-1; j>i;j--) {
        //         if(nums[i] +nums[j]==target) {
        //             res[0]=i;
        //             res[1]=j;
        //             continue;
        //         }
        //     }
        // }
        // return res;
        //hashMap
        Map<Integer, Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(target-nums[i])){
                return new int[] {i, map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }
        return new int[] {0,0};
    }
}
