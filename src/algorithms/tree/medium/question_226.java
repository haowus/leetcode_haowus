package algorithms.tree.medium;

import algorithms.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author haowus919@gmail.com
 * @date 2020/6/6 21:23
 */
public class question_226 {
    public TreeNode invertTree(TreeNode root) {
//递归
//        if (root==null) return null;
//
//        TreeNode temp = root.left;
//        root.left = root.right;
//        root.right = temp;
//
//        invertTree(root.left);
//        invertTree(root.right);
//
//        return root;

        //迭代
        if (root==null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode cur = queue.poll();
            TreeNode temp = cur.left;
            cur.left = cur.right;
            cur.right = temp;
            //交换之后再入队列
            if (cur.left!=null) queue.add(cur.left);
            if (cur.right!=null) queue.add(cur.right);
        }
        return root;
    }
}
