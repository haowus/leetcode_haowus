package leetcode_sf_offer;



/**
 * 剑指 Offer 27. 二叉树的镜像
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/20 15:41
 */
public class IQ_27 {
//    public TreeNode mirrorTree(TreeNode root) {
//        if(root==null) return null;
//        swapTree(root);
//        return root;
//
//    }
//    private void swapTree(TreeNode root){
//        //root==null 为了防止只有一个子树的情况
//        if (root==null||(root.left==null && root.right==null)) return;
//
//        TreeNode temp = root.left;
//        root.left = root.right;
//        root.right = temp;
//
//        swapTree(root.left);
//        swapTree(root.right);
//
//    }

    public TreeNode mirrorTree(TreeNode root) {
        if (root==null) return null;

        TreeNode temp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);
        return root;
    }
}
