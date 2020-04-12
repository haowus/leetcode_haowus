package sword_finger_offer;

import java.util.ArrayList;

public class convertBST {
    TreeNode lastNodeList = null;
    public TreeNode Convert(TreeNode pRootOfTree) {

        inOrderConvert(pRootOfTree);
        //寻找链表头节点
        while (lastNodeList != null && lastNodeList.left != null)
            lastNodeList = lastNodeList.left;
        return lastNodeList;

    }
    private void inOrderConvert(TreeNode root){

        if (root == null)
            return;
        if (root != null) {
            inOrderConvert(root.left);
            root.left = lastNodeList;
            if (lastNodeList != null)
                lastNodeList.right = root;
            lastNodeList = root;
            inOrderConvert(root.right);
        }
    }
}
