package Week3;

import java.util.LinkedList;
import java.util.Queue;

public class _297serializeAndDeserialize {

     //* Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if(root == null){
                return "";
            }
            StringBuilder res = new StringBuilder();
            res.append("[");
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while(!queue.isEmpty()){
                TreeNode node = queue.poll();
                if(node != null){
                    res.append("" + node.val);
                    queue.offer(node.left);
                    queue.offer(node.right);
                }else{
                    res.append("null");
                }
                res.append(",");
            }
            res.append("]");
            return res.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if(data == ""){
                return null;
            }
            String[] dataList = data.substring(1, data.length() - 1).split(",");
            TreeNode root = new TreeNode(Integer.parseInt(dataList[0]));
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int i = 1;
            while(!queue.isEmpty()){
                TreeNode node = queue.poll();
                if(!"null".equals(dataList[i])){
                    node.left = new TreeNode(Integer.parseInt(dataList[i]));
                    queue.offer(node.left);
                }
                i++;
                if(!"null".equals(dataList[i])){
                    node.right = new TreeNode(Integer.parseInt(dataList[i]));
                    queue.offer(node.right);
                }
                i++;
            }
            return root;
        }
    }

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
}
