package algorithms.tree.easy;

import algorithms.tree.TreeNode;

public class question_111 {


    public int minDepth(TreeNode root) {
        if (root==null) return 0;  //说明该节点的父节点是叶子节点

        if (root.left!=null && root.right==null) {
            return minDepth(root.left) + 1;
        }
        if (root.left==null && root.right!=null){
            return minDepth(root.right)+1;
        }


        return Math.min(minDepth(root.left),minDepth(root.right))+1;

    }

}
