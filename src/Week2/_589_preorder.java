package Week2;

import java.util.ArrayList;
import java.util.List;

//N叉树的前序遍历
public class _589_preorder {
    /*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

    class Solution {
        // 第二遍
        public List<Integer> preorder(Node root) {
            List<Integer> res = new ArrayList<>();
            helper(root, res);
            return res;
        }
        public void helper(Node root, List<Integer> res) {
            if(root == null) {
                return;
            }
            res.add(root.val);
            for(Node n:root.children) {
                helper(n, res);
            }
        }
    }














// public List<Integer> preorder(Node root) {
    //     //先访问头节点
    //     //模仿BST前序递归模板
    //     List<Integer> res = new ArrayList<Integer>();
    //     pre(root, res);
    //     return res;
    // }

    // public void pre(Node root, List<Integer> res) {
    //     if(root == null) {
    //         return;
    //     }
    //     res.add(root.val);
    //     for(Node cur:root.children) {
    //         pre(cur, res);
    //     }
    // }
}
