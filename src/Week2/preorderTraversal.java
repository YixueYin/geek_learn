package Week2;
//二叉树的前序遍历

import java.util.ArrayList;
import java.util.List;


class Solution2 {
    public List<Integer> preorderTraversal(TreeNode root) {
        //背模板，前序遍历
        List<Integer> res = new ArrayList<Integer>();
        preOrder(root, res);
        return res;
    }

    public void preOrder(TreeNode root, List<Integer> res) {
        if(root == null) {
            return;
        }
        res.add(root.val);
        preOrder(root.left, res);
        preOrder(root.right, res);
    }
}