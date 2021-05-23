package Week7;

import java.util.*;
public class _433minMutation {
    public int minMutation(String start, String end, String[] bank) {
        Set<String> dict = new HashSet<>(), st = new HashSet<>(), ed = new HashSet<>();
        for(String s : bank) dict.add(s);
        if(!dict.contains(end)) return -1;

        st.add(start);
        ed.add(end);
        return bfs(st, ed, dict, 0);
    }

    // 宽搜
    private int bfs(Set<String> st, Set<String> ed, Set<String> dict, int len) {
        // 起始集合为空，那么就无法到达目标
        if(st.size() == 0) return -1;
        // 优先从数量少的一端开始搜索，减少搜索量
        if(st.size() > ed.size()) return bfs(ed, st, dict, len);

        Set<String> next = new HashSet<>();
        char[] mode = {'A', 'C', 'G', 'T'};
        // 枚举起始集合可以一步转换的所有基因序列
        for(String s : st) {
            StringBuilder temp = new StringBuilder(s);
            for(int i = 0; i < 8; i++) {
                for(int j = 0; j < 4; j++) {
                    // 不包含相同的字符
                    if(s.charAt(i) == mode[j]) continue;
                    temp.setCharAt(i, mode[j]);
                    String cur = temp.toString();
                    // 终点集合中包含了当前字符，那么直接返回步数
                    if(ed.contains(cur)) return len + 1;
                    // 如果是合法序列，则加入下一个搜索集合中
                    if(dict.contains(cur)) {
                        next.add(cur);
                    }
                    temp.setCharAt(i, s.charAt(i));
                }
            }
        }
        // 搜索下一层
        return bfs(next, ed, dict, len + 1);
    }
}
