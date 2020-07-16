package leetcode_sf_offer;

/**
 * 面试题68 - I. 二叉搜索树的最近公共祖先
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/7/15 20:26
 */
public class IQ_68_I {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null) return null;

        if (p.val<root.val && q.val<root.val){
            return lowestCommonAncestor(root.left,p,q);
        }else if (p.val>root.val && q.val>root.val)
            return lowestCommonAncestor(root.right,p,q);

        return root;

    }
}
