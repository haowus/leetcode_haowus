package leetcode_sf_offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 面试题07. 重建二叉树
 * @author haowus919@gmail.com in dormitory
 * @date 2020/6/18 20:18
 */
public class IQ_07 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        int prelen = preorder.length;
        int inlen = inorder.length;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<inlen;i++)
            map.put(inorder[i],i);

        return buildTree(preorder,map,0,prelen-1,0,inlen-1);



    }
    private TreeNode buildTree(int[] preorder,Map<Integer,Integer> map,int preleft,int preright,int inleft,int inright){
        if (preleft>preright||inleft>inright) return null;
        int rootval = preorder[preleft];
        TreeNode root = new TreeNode(rootval);
        int pindex = map.get(rootval);
        root.left = buildTree(preorder,map,preleft+1,pindex-inleft+preleft,inleft,pindex-1);
        root.right = buildTree(preorder,map,pindex-inleft+preleft+1,preright,pindex+1,inright);
        return root;

    }

}
