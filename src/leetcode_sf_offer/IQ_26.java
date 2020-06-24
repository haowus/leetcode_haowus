package leetcode_sf_offer;

/**
 * 剑指 Offer 26. 树的子结构
 * @author haowus919@gmail.com in dormitory
 * @date 2020/6/20 12:11
 */
public class IQ_26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {

        if (A==null || B==null) return false;

        //以该节点为根节点的树  以该节点的左孩子为根节点的树  以该节点的右孩子为根节点的树
        return ispath(A,B) ||isSubStructure(A.left,B)||isSubStructure(A.right,B);


    }
    private boolean ispath(TreeNode A,TreeNode B){
        if (B==null) return true;  //B为空，说明找完了
        if (A==null) return false;   //A为空，说明找完了A，还没有符合B的子树
        return A.val == B.val && ispath(A.left,B.left)&& ispath(A.right,B.right);
    }
}
