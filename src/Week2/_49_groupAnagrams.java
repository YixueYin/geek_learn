package Week2;

import java.util.*;

//字母异位词分类
public class _49_groupAnagrams {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            //1.暴力排序求解
            //不需要判断“是否”是字母异位词，因为本来题目里就明确写出是“字母异位词”了
            Map<String, List<String>> map = new HashMap<>();
            for(String s: strs) {
                char[] ch = s.toCharArray();
                Arrays.sort(ch);
                String res = new String(ch);
                List curList = map.getOrDefault(res, new ArrayList<String>());
                curList.add(s);
                map.put(res, curList);
            }
            return new ArrayList<List<String>>(map.values());
        }
    }
}
