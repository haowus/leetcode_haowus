package leetcode_sf_offer;



/**
 * 剑指 Offer 55 - II. 平衡二叉树
 * @author haowus919@gmail.com in dormitory
 * @date 2020/7/8 0:01
 */
public class IQ_55_II {
//    public boolean isBalanced(TreeNode root) {
//        if (root==null) return true;
//
//        //以根节点为根的左右子树最大深度之差<=1 && 左子树是否平衡 && 右子树是否平衡
//        return Math.abs(maxdepth(root.left)-maxdepth(root.right))<=1 &&
//                isBalanced(root.left) && isBalanced(root.right);
//    }
//
//    private int maxdepth(TreeNode root){
//        if (root==null) return 0;
//        else
//            return Math.max(maxdepth(root.left),maxdepth(root.right))+1;
//    }

    public boolean isBalanced(TreeNode root) {

        return helper_bal(root)==-1;
    }
    private int helper_bal(TreeNode root){

        if (root==null) return 0;

        int left = helper_bal(root.left);
        if (left==-1) return -1;    //剪枝
        int right = helper_bal(root.right);
        if (right==-1) return -1;   //剪枝

        return Math.abs(left-right)<=1 ? Math.max(left,right)+1 : -1;
    }
}
