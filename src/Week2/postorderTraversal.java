package Week2;
//二叉树的后序遍历
import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution3 {
    public List<Integer> postorderTraversal(TreeNode root) {
        //背模板
        List<Integer> res = new ArrayList<Integer>();
        postorder(root, res);
        return res;
    }

    public void postorder(TreeNode root, List<Integer> res) {
        if(root == null) {
            return;
        }
        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }
}