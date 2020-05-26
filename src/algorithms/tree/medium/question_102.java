package algorithms.tree.medium;

import algorithms.tree.TreeNode;

import java.util.*;

public class question_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        if (root==null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode front;
        queue.add(root);
        while (!queue.isEmpty()){
            int count = queue.size();
            List<Integer> in = new ArrayList<>();
            while (count!=0){
                front = queue.peek();
                in.add(queue.poll().val);

                if (front.left!=null)
                    queue.add(front.left);
                if (front.right!=null)
                    queue.add(front.right);

                count--;
            }
            res.add(in);
        }
        return res;

    }
}
