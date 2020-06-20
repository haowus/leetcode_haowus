package leetcode_sf_offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 剑指 Offer 32 - III. 从上到下打印二叉树 III
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/20 21:11
 */
public class IQ_32_III {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root==null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth=1;
        while (!queue.isEmpty()){

            depth++;
            int size = queue.size();
            List<Integer> in = new ArrayList<>();
            while (size>0){
                TreeNode node = queue.poll();
                in.add(node.val);
                if (node.left!=null) queue.add(node.left);
                if (node.right!=null) queue.add(node.right);
                size--;
            }
            if (depth%2!=0)
                in = reverse(in);
            res.add(in);
        }
        return res;
    }
    private List<Integer> reverse(List<Integer> res){
        List<Integer> ans = new ArrayList<>();
        for (int i=res.size()-1;i>=0;i--)
            ans.add(res.get(i));
        return ans;

    }
}
