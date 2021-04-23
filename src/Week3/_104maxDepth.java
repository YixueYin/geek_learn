package Week3;

public class _104maxDepth {
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
    class Solution {
        public int maxDepth(_226invertTree.TreeNode root) {
            //DFS
            if(root == null) {
                return 0;
            }
            int leftDeep = maxDepth(root.left);
            int rightDeep = maxDepth(root.right);
            return Math.max(leftDeep, rightDeep)+1;
        }
    }
}
