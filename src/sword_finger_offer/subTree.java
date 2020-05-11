package sword_finger_offer;

public class subTree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {

        if (root1==null||root2==null) return false;

        boolean res = false;
        if (root1.val==root2.val){
            res = isSubtree(root1,root2);
        }
        if (res==false) res=HasSubtree(root1.left,root2);
        if (res==false) res=HasSubtree(root1.right,root2);

        return res;
    }
    public boolean isSubtree(TreeNode root1,TreeNode root2){
        if (root2==null)
            return true;
        else if (root1==null)
            return false;
        if (root1.val!=root2.val)
            return false;
        return isSubtree(root1.left,root2.left)&&isSubtree(root1.right,root2.right);
    }
}
