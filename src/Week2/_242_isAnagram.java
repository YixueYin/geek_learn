package Week2;

import java.util.Arrays;

public class _242_isAnagram {
    //思考
//1. 暴力，把两个string改为字符数组，然后分别排序，最后直接比较
//2. HashMap计数
    class Solution {
        public boolean isAnagram(String s, String t) {
            // //第二遍
            // //Hashmap
            // char[] arr_s = s.toCharArray();
            // char[] arr_t = t.toCharArray();
            // if(arr_t.length != arr_s.length) {
            //     return false;
            // }
            // Map<Character, Integer> map = new HashMap<>();
            // for(Character ch:arr_s) {
            //     map.put(ch, map.getOrDefault(ch, 0) +1);
            // }
            // for(Character ch:arr_t) {
            //     map.put(ch, map.getOrDefault(ch, 0) -1);
            //     if(map.get(ch)<0) {
            //         return false;
            //     }
            // }
            // return true;
            //1. 暴力,比较简单
            char[] arr_s = s.toCharArray();
            char[] arr_t = t.toCharArray();
            Arrays.sort(arr_s);
            Arrays.sort(arr_t);
            return Arrays.equals(arr_t, arr_s);
            //2. HashMap, 不熟练
            // char[] arr_s = s.toCharArray();
            // char[] arr_t = t.toCharArray();
            // if(arr_t.length != arr_s.length) {
            //     return false;
            // }
            // Map<Character, Integer> map = new HashMap<>();

            // for(int i= 0; i<arr_s.length; i++) {
            //     map.put(arr_s[i], map.getOrDefault(arr_s[i], 0)+1);
            // }
            // for(int i =0; i<arr_t.length;i++) {
            //     map.put(arr_t[i], map.getOrDefault(arr_t[i], 0)-1);
            //     if(map.get(arr_t[i])<0) {
            //         return false;
            //     }
            // }
            // return true;
        }
    }
}
