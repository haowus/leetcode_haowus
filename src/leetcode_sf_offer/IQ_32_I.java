package leetcode_sf_offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 剑指 Offer 32 - I. 从上到下打印二叉树
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/20 20:39
 */
public class IQ_32_I {

    public int[] levelOrder(TreeNode root) {
        if(root==null) return new int[0];
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            res.add(node.val);
            if (node.left!=null) queue.add(node.left);
            if (node.right!=null) queue.add(node.right);
        }
        int [] result = new int[res.size()];
        for (int i=0;i<res.size();i++)
            result[i] = res.get(i);
        return result;

    }

}
