package algorithms.tree.medium;

import algorithms.tree.TreeNode;

import java.util.*;

/**
 * @author haowus919@gmail.com
 * @date 2020/6/5 22:03
 */
public class question_199 {
    List<Integer> res = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if (root==null) return res;
        rightnode(root);
        return res;

    }

    private void rightnode(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()){

            int size = queue.size();
            List<Integer> sub = new ArrayList<>();
            while (size>0){

                TreeNode cur = queue.poll();
                sub.add(cur.val);
                if (cur.left != null) queue.add(cur.left);
                if (cur.right != null) queue.add(cur.right);

                size--;
            }

            res.add(sub.get(sub.size()-1));

        }
    }
}
