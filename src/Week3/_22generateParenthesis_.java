package Week3;

import java.util.ArrayList;
import java.util.List;

public class _22generateParenthesis_ {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        //典型的递归题目
        _generate(0, 0, n, "");
        return res;
    }

    private void _generate(int left, int right, int capacity, String s) {
        //terminator
        if(left == capacity && right == capacity) {
            res.add(s);
            return;
        }
        //current logic
        //如果要添加左括号，那么限制条件是：左括号数量没有超过capacity
        if(left < capacity) {
            _generate(left + 1, right, capacity, s + '(');
        }
        //如果要添加右括号，那么限制条件是：右括号数量么有超过左括号
        if(right < left) {
            _generate(left, right+1, capacity, s+')');
        }
        //drill down
    }
}
