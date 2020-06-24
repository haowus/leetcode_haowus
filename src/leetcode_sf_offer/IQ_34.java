package leetcode_sf_offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 34. 二叉树中和为某一值的路径
 * 输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。
 * 从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
 * @author haowus919@gmail.com in dormitory
 * @date 2020/6/21 22:40
 */
public class IQ_34 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> list = new ArrayList<>();
        path_sum(root,sum,list);
        return res;
    }
    private void path_sum(TreeNode root,int sum,List<Integer> list){
        if (root==null) return;
        list.add(root.val);
        sum -= root.val;

        if (sum==0 && root.left==null && root.right==null)
            res.add(new ArrayList<>(list));
        path_sum(root.left,sum,list);
        path_sum(root.right,sum,list);
        list.remove(list.size()-1);
    }
}
