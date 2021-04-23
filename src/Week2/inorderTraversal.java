package Week2;
//二叉搜索树的中序遍历
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {

    //递归写法
     public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> res = new ArrayList<Integer>();
         inorder(root, res);
         return res;
     }
     public void inorder(TreeNode root, List<Integer> res) {
         if(root == null) {
             return;
         }
         inorder(root.left, res);
         res.add(root.val);
         inorder(root.right, res);
     }

    //使用递归其实是隐式维护了一个栈
    //尝试使用迭代
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList();
//        Stack<TreeNode> stack = new Stack();
//        while(root!=null || !stack.isEmpty()) {
//            while(root!=null) {
//                stack.push(root);
//                root = root.left;
//            }
//            root = stack.pop();
//            list.add(root.val);
//            root = root.right;
//        }
//        return list;
//    }
}