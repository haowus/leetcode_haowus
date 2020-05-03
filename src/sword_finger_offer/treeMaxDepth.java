package sword_finger_offer;

public class treeMaxDepth {

    public int TreeDepth(TreeNode root) {

        if (root==null) return 0;

        int leftDeep = TreeDepth(root.left);  //左子树
        int rightDeep = TreeDepth(root.right);  //右子树

        return Math.max(leftDeep+1,rightDeep+1);

    }

    public boolean isBalancedTree(TreeNode root){
        if (root == null) return true;
        int leftHeight = TreeDepth(root.left);
        int rightHeight = TreeDepth(root.right);
        int diff = Math.abs(leftHeight-rightHeight);
        if (diff>1) return false;
        return isBalancedTree(root.left) && isBalancedTree(root.right);
    }


}
