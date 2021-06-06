package Week9;

import java.util.HashMap;
import java.util.Map;

public class isIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        //维护两个HashMap，在增加元素的时候判断是否对应
        Map<Character, Character> s2t = new HashMap<Character, Character>();
        Map<Character, Character> t2s = new HashMap<Character, Character>();
        int n = s.length();
        for(int i =0; i< n; i++) {
            Character x = s.charAt(i);
            Character y = t.charAt(i);
            if(s2t.containsKey(x)&&s2t.get(x)!=y || t2s.containsKey(y) && t2s.get(y)!=x) {
                return false;
            }
            s2t.put(x, y);
            t2s.put(y, x);
        }
        return true;
    }
}
