package algorithms.tree.easy;

import algorithms.tree.TreeNode;

/**
 * @author haowus919@gmail.com
 * @date 2020/6/1 21:47
 */
public class question_112 {
    public boolean hasPathSum(TreeNode root, int sum) {

        if (root==null)
            return false;

        sum -= root.val;

        if (root.left==null && root.right==null && sum==0)
            return true;

        return hasPathSum(root.left,sum)||hasPathSum(root.right,sum);
    }

}
