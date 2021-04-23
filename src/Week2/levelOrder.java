package Week2;
//N叉树的层次遍历

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};


class Solution4 {
    //BFS
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) {return res;}
        List<Node> previousLayer = Arrays.asList(root);

        while(!previousLayer.isEmpty()) {
            List<Integer> previousVals = new ArrayList<>();
            List<Node> currentLayer = new ArrayList<>();
            for(Node node: previousLayer) {
                previousVals.add(node.val);
                currentLayer.addAll(node.children);
            }
            res.add(previousVals);
            previousLayer=currentLayer;
        }
        return res;
    }
    // //用队列存储每一层的Node
    // public List<List<Integer>> levelOrder(Node root) {
    //     List<List<Integer>> res = new ArrayList<>();
    //     if(root == null) return res;
    //     Queue<Node> queue = new LinkedList<Node>();
    //     queue.add(root);
    //     while(!queue.isEmpty()) {
    //         List<Integer> level = new ArrayList();
    //         int size = queue.size();
    //         for(int i=0;i<size;i++) {
    //             Node node= queue.poll();
    //             level.add(node.val);
    //             queue.addAll(node.children);
    //         }
    //         res.add(level);
    //     }
    //     return res;
    // }
}
