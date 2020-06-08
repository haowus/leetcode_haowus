package algorithms.tree.easy;

import algorithms.tree.TreeNode;

/**
 * @author haowus919@gmail.com
 * @date 2020/6/8 21:28
 */
public class question_404 {

//    public int sumOfLeftLeaves(TreeNode root) {
//        if (root==null) return 0;
//        int sum=0;
//        if (root.left!=null && root.left.left==null && root.left.right==null ){
//            sum += root.left.val;
//        }
//
//        return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right)+sum;
//    }
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root==null) return 0;

        if (root.left!=null && root.left.left==null && root.left.right==null ){
            sum += root.left.val;
        }

        sumOfLeftLeaves(root.left);  //往左子树中找左叶子节点，碰到就加起来
        sumOfLeftLeaves(root.right);  //往右子树中找左叶子节点，碰到就加起来
        return sum;
    }
}
