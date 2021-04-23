package Week3;

import java.util.LinkedList;
import java.util.Queue;

public class _111minDepth {
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
        public int minDepth(_226invertTree.TreeNode root) {
            //2.BFS
            //维护一个队列，一层一层遍历下去
            if (root == null)
                return 0;
            Queue<_226invertTree.TreeNode> queue = new LinkedList<_226invertTree.TreeNode>();
            queue.offer(root);
            int level = 0;

            while(!queue.isEmpty()) {
                //计数层数
                level++;
                //先统计当前层有多少节点，其实就是当前队列有多少元素
                int levelCount = queue.size();
                for(int i = 0; i<levelCount; i++) {
                    _226invertTree.TreeNode curr = queue.poll();
                    //如果当前节点左右子节点都是空，那么说明当前节点是叶节点，直接返回
                    if(curr.left == null && curr.right == null) {
                        return level;
                    }
                    if(curr.left != null) {
                        queue.offer(curr.left);
                    }
                    if(curr.right != null) {
                        queue.offer(curr.right);
                    }
                }
            }
            return -1;



            // //1.DFS
            // if(root == null) {
            //     return 0;
            // }else if(root.left == null) {
            //     return minDepth(root.right)+1;
            // }else if (root.right == null) {
            //     return minDepth(root.left)+1;
            // }else {
            //     return Math.min(minDepth(root.left), minDepth(root.right)) +1;
            // }
        }
    }
}
