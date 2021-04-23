package Week4;

import java.util.*;

public class _515largestValues {

     // Definition for a binary tree node.
      public class TreeNode {
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

        public List<Integer> largestValues(TreeNode root) {
            //类似于二叉树的层序遍历
            //只要对每一层的数组进行排序即可
            //数组排序
            List<Integer> res = new ArrayList<>();
            Queue<TreeNode> queue = new ArrayDeque<>();
            if(root != null) {
                queue.add(root);
            }
            while(!queue.isEmpty()) {
                int levelCount = queue.size();
                int[] level = new int[levelCount];
                //         PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new Comparator<Integer>() {
                //     @Override
                //     public int compare(Integer o1, Integer o2) {
                //         return o2-o1;
                //     }
                // });

                for(int i=0;i<levelCount;i++) {
                    TreeNode node = queue.poll();
                    // pq.add(node.val);
                    level[i] = node.val;
                    if(node.left != null) {
                        queue.add(node.left);
                    }
                    if(node.right != null) {
                        queue.add(node.right);
                    }
                }
                Arrays.sort(level);
                res.add(level[levelCount-1]);
            }
            return res;
        }

}
