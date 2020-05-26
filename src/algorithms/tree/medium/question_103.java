package algorithms.tree.medium;

import algorithms.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class question_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root==null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode front;
        queue.add(root);
        int c = 1;
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
            c++;
            if (c%2!=0)
                res.add(reverse(in));
            else
                res.add(in);
        }
        return res;
    }
    private List<Integer> reverse(List<Integer> out){
        List<Integer> res = new ArrayList<>();
        for (int i=out.size()-1;i>=0;i--){
            res.add(out.get(i));
        }
        return res;
    }
}
