package leetcode_sf_offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 剑指 Offer 32 - II. 从上到下打印二叉树 II
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/20 21:07
 */
public class IQ_32_II {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root==null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){

            int size = queue.size();
            List<Integer> in = new ArrayList<>();
            while (size>0){
                TreeNode node = queue.poll();
                in.add(node.val);
                if (node.left!=null) queue.add(node.left);
                if (node.right!=null) queue.add(node.right);
                size--;
            }
            res.add(in);
        }
        return res;
    }
}
