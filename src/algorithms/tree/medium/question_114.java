package algorithms.tree.medium;

import algorithms.tree.TreeNode;

public class question_114 {
    public void flatten(TreeNode root) {

        if (root==null)
            return;
        flatten(root.left);   //一直往左子树走，直到叶子节点
        flatten(root.right);   //
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;
        while (root.right!=null)
            root = root.right;
        root.right = temp;

    }


}
