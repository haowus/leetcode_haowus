package algorithms.tree.easy;

import algorithms.tree.TreeNode;

public class question_110 {
    public boolean isBalanced(TreeNode root) {

        if (root==null) return true;
        if (Math.abs(height(root.left)-height(root.right))>1) return false;
        else
            return isBalanced(root.left) && isBalanced(root.right);
    }

    private int height(TreeNode root){
        if (root==null)
            return -1;
        else
            return 1+Math.max(height(root.left),height(root.right));
    }
}
