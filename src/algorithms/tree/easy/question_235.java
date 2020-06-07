package algorithms.tree.easy;

import algorithms.tree.TreeNode;

/**
 * @author haowus919@gmail.com
 * @date 2020/6/7 22:19
 */
public class question_235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if ((p.val-root.val)*(q.val-root.val)<=0) return root;

        else if (p.val<root.val && q.val<root.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        else {
            return lowestCommonAncestor(root.right,p,q);
        }

    }
}
