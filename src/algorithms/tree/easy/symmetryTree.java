package algorithms.tree.easy;

public class symmetryTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x) {val = x;}
    }

    public boolean isSymmetric(TreeNode root){

        if(root==null) return true;
        else return equ(root.left,root.right);
    }

    public boolean equ(TreeNode left_sub,TreeNode right_sub){
        if(left_sub==null&&right_sub==null) return true;
        else if (left_sub==null||right_sub==null) return false;
        else if (left_sub.val==right_sub.val)
            return equ(left_sub.left,right_sub.right)&&equ(left_sub.right,right_sub.left);
        else
            return false;
    }
}
