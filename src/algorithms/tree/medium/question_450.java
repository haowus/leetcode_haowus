package algorithms.tree.medium;

import algorithms.tree.TreeNode;

/**
 * @author haowus919@gmail.com
 * @date 2020/6/10 23:01
 */
public class question_450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root==null) return null;

        if (key<root.val) //key小于root,往root的左子树去找
            root.left = deleteNode(root.left,key);
        else if (key>root.val) //key大于root,往root的右子树去找
            root.right = deleteNode(root.right,key);
        else {  //key等于root，找到了key
            if (root.left==null)   // 左子树为空，直接删掉root,返回root的右子树，即是答案
                return root.right;
            else if (root.right==null) // 右子树为空，直接删掉root,返回root的左子树，即是答案
                return root.left;
            else {  //左右子树都存在，将左子树放在右子树的最左节点下面
                TreeNode node = root.right;
                while (node.left!=null) //找到右子树的最左节点
                    node = node.left;
                node.left = root.left;
                return root.right;

            }
        }

        return root;
    }
}
