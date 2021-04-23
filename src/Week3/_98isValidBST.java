package Week3;

public class _98isValidBST {
    // /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
//  //二叉搜索树中序遍历的重要特征：有序
// class Solution {
//     public boolean isValidBST(TreeNode root) {
//         List<Integer> res = new ArrayList<Integer>();
//         inorder(root, res);
//         int size = res.size();
//         int[] nums = new int[size];
//         int count = 0;
//         for(Integer num : res) {
//             nums[count++] = num;
//         }
//         for(int i=0; i<size-1; i++) {
//             if(nums[i] >= nums[i+1]){
//                 return false;
//             }
//         }
//         return true;
//     }

    //     public void inorder(TreeNode root, List<Integer> res) {
//         if(root == null) {
//             return;
//         }
//         inorder(root.left, res);
//         res.add(root.val);
//         inorder(root.right, res);
//     }
// }
    class Solution {
        long pre = Long.MIN_VALUE;
        public boolean isValidBST(_226invertTree.TreeNode root) {
            if (root == null) {
                return true;
            }
            // 访问左子树
            if (!isValidBST(root.left)) {
                return false;
            }
            // 访问当前节点：如果当前节点小于等于中序遍历的前一个节点，说明不满足BST，返回 false；否则继续遍历。
            if (root.val <= pre) {
                return false;
            }
            pre = root.val;
            // 访问右子树
            return isValidBST(root.right);
        }
    }
}
