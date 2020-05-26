package algorithms.tree.medium;

import algorithms.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class question_105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        int prelen = preorder.length;
        int inlen = inorder.length;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<inlen;i++)
            map.put(inorder[i],i);
        return buildTree(preorder,0,prelen-1,map,0,inlen-1);
    }

    private TreeNode buildTree(int[] preorder, int preleft, int preright, Map<Integer, Integer> map, int inleft, int inright) {

        if (preleft>preright||inleft>inright) return null;

        int rootVal = preorder[preleft];
        TreeNode root = new TreeNode(rootVal);
        int pindex = map.get(rootVal);  //在中序遍历中找到根节点的位置。根节点左边为左子树，右边为右子树。

        root.left = buildTree(preorder,preleft+1,pindex-inleft+preleft,map,inleft,pindex-1);
        root.right = buildTree(preorder,pindex-inleft+preleft+1,preright,map,pindex+1,inright);

        return root;
    }
}
