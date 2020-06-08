package algorithms.tree.medium;

import algorithms.tree.ConstructTree;
import algorithms.tree.TreeNode;

/**
 * @author haowus919@gmail.com
 * @date 2020/6/8 20:45
 */
public class question_236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null) return right;
        if(right == null) return left;
        return root;
    }

    public static void main(String[] args) {
        Integer[] nums = {3,5,1,6,2,0,8,null,null,7,4};
        TreeNode root = ConstructTree.constructTree(nums);

        Integer[] numsp = {5,1,6,2,0,8,null,null,7,4};
        TreeNode p = ConstructTree.constructTree(numsp);

        Integer[] numsq = {4};
        TreeNode q= ConstructTree.constructTree(numsq);

        question_236 q236 = new question_236();
        q236.lowestCommonAncestor(root,p,q);
    }


}
