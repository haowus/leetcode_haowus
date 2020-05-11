package algorithms.tree.easy;

import algorithms.tree.TreeNode;

public class depth {

    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}
