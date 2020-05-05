package sword_finger_offer;

import java.util.ArrayList;


public class findKthNode {
    TreeNode KthNode(TreeNode pRoot, int k) {

        if(pRoot == null || k <= 0){
            return null;
        }
        ArrayList<TreeNode> treeNodes = new ArrayList<>();
        inorder(pRoot,treeNodes);
        return treeNodes.get(k-1);

    }
    private void inorder(TreeNode node, ArrayList<TreeNode> treeNodes){
        if (node==null) return;  //递归条件：直到该节点无左节点的时候，
        inorder(node.left,treeNodes);
        treeNodes.add(node);   //添加该节点
        inorder(node.right,treeNodes);
    }

}
