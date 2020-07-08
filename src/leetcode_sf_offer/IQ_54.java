package leetcode_sf_offer;

/**
 * 剑指 Offer 54. 二叉搜索树的第k大节点
 * @author haowus919@gmail.com in dormitory
 * @date 2020/7/7 22:09
 * 遍历的时候，先右子树再左子树
 */
public class IQ_54 {
//    List<Integer> res = new ArrayList<>();
    private int res,count;
    public int kthLargest(TreeNode root, int k) {
        inorder(root,k);
        return res;
    }
    private void inorder(TreeNode node,int k){
        if (node==null) return;
        inorder(node.right,k);
        if (++count==k)
            res = node.val;
        inorder(node.left,k);
    }
}
