package Week4;

import java.util.*;

public class _102levelOrder {

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

     //BFS
        class Node {
            /**
             * 当前得到的字符串
             */
            private String res;
            /**
             * 剩余左括号数量
             */
            private int left;
            /**
             * 剩余右括号数量
             */
            private int right;

            public Node(String str, int left, int right) {
                this.res = str;
                this.left = left;
                this.right = right;
            }
        }

        public List<String> generateParenthesis(int n) {
            List<String> res = new ArrayList<>();
            if (n == 0) {
                return res;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.offer(new Node("", n, n));

            while (!queue.isEmpty()) {

                Node curNode = queue.poll();
                if (curNode.left == 0 && curNode.right == 0) {
                    res.add(curNode.res);
                }
                if (curNode.left > 0) {
                    queue.offer(new Node(curNode.res + "(", curNode.left - 1, curNode.right));
                }
                if (curNode.right > 0 && curNode.left < curNode.right) {
                    queue.offer(new Node(curNode.res + ")", curNode.left, curNode.right - 1));
                }
            }
            return res;
        }



    //DFS
    public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            Queue<TreeNode> nodes = new ArrayDeque<>();
            if(root != null) {
                nodes.add(root);
            }

            while(!nodes.isEmpty()) {
                int levelCount = nodes.size();
                List<Integer> thisLevel = new ArrayList<Integer>();
                for(int i=0;i<levelCount;i++) {
                    TreeNode curr = nodes.poll();
                    thisLevel.add(curr.val);
                    if(curr.left != null) {
                        nodes.add(curr.left);
                    }
                    if(curr.right != null) {
                        nodes.add(curr.right);
                    }
                }
                res.add(thisLevel);
            }
            return res;
        }

}
