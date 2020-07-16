package leetcode_sf_offer;

/**
 * 面试题68 - II. 二叉树的最近公共祖先
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/7/15 20:35
 */
public class IQ_68_II {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root==null) return null;
        if (root.val==p.val ||root.val==q.val) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if (left!=null && right!=null) return root;
        if (left!=null) return left;
        return right;
    }
}
