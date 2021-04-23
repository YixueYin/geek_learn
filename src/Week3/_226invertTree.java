package Week3;

public class _226invertTree {
    /**
     * Definition for a binary tree node.
     **/ public class TreeNode {
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
        public TreeNode invertTree(TreeNode root) {
            //terminator
            if(root == null) {
                return root;
            }
            //current logic
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            //drill down
            invertTree(root.right);
            invertTree(root.left);
            //restore
            return root;
        }
    }
}
