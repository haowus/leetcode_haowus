package sword_finger_offer;

public class mirrorTree {
    public void Mirror(TreeNode root) {
        while(root!=null){
            TreeNode tn ;
            tn = root.left;
            root.left = root.right;
            root.right = tn;
            Mirror(root.left);
            Mirror(root.right);
        }
    }

}
