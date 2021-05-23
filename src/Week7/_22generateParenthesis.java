package Week7;

import java.awt.color.ICC_ProfileGray;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class _22generateParenthesis {
    //第三遍
    private List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        _generate(0, 0, n, "");
        return res;
    }
    //递归
    private void _generate(int left, int right, int capacity, String s) {
        //终止条件
        if(left >= capacity && right >= capacity) {
            res.add(s);
            return;
        }
        //当前逻辑
        //判断左右括号的容量然后加一
        if(left< capacity) {
            _generate(left+1, right, capacity, s+'(');
        }
        if(right<left) {
            _generate(left, right+1,capacity, s+')');
        }
    }
}


// class Solution {
//     List<String> res = new ArrayList<>();
//     public List<String> generateParenthesis(int n) {
//         //典型的递归题目
//         _generate(0, 0, n, "");
//         return res;
//     }

//     private void _generate(int left, int right, int capacity, String s) {
//         //terminator
//         if(left == capacity && right == capacity) {
//             res.add(s);
//             return;
//         }
//         //current logic
//         //如果要添加左括号，那么限制条件是：左括号数量没有超过capacity
//         if(left < capacity) {
//             _generate(left + 1, right, capacity, s + '(');
//         }
//         //如果要添加右括号，那么限制条件是：右括号数量么有超过左括号
//         if(right < left) {
//             _generate(left, right+1, capacity, s+')');
//         }
//         //drill down
//     }
// }


// import java.util.ArrayDeque;
// import java.util.ArrayList;
// import java.util.Deque;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Queue;

// public class Solution {

//     class Node {
//         /**
//          * 当前得到的字符串
//          */
//         private String res;
//         /**
//          * 剩余左括号数量
//          */
//         private int left;
//         /**
//          * 剩余右括号数量
//          */
//         private int right;

//         public Node(String str, int left, int right) {
//             this.res = str;
//             this.left = left;
//             this.right = right;
//         }
//     }

//     public List<String> generateParenthesis(int n) {
//         List<String> res = new ArrayList<>();
//         if (n == 0) {
//             return res;
//         }
//         Queue<Node> queue = new LinkedList<>();
//         queue.offer(new Node("", n, n));

//         while (!queue.isEmpty()) {

//             Node curNode = queue.poll();
//             if (curNode.left == 0 && curNode.right == 0) {
//                 res.add(curNode.res);
//             }
//             if (curNode.left > 0) {
//                 queue.offer(new Node(curNode.res + "(", curNode.left - 1, curNode.right));
//             }
//             if (curNode.right > 0 && curNode.left < curNode.right) {
//                 queue.offer(new Node(curNode.res + ")", curNode.left, curNode.right - 1));
//             }
//         }
//         return res;
//     }

