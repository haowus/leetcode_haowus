package algorithms.tree.medium;

import algorithms.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author haowus919@gmail.com
 * @date 2020/6/4 21:03
 */
public class question_144 {


    //递归
//    List<Integer> res = new ArrayList<>();
//    public List<Integer> preorderTraversal(TreeNode root) {
//
//        if (root==null) return null;
//
//        res.add(root.val);
//        preorderTraversal(root.left);
//        preorderTraversal(root.right);
//
//        return res;
//
//
//    }


    //迭代  栈
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root==null) return res;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()){
            TreeNode node = stack.pop();
            res.add(node.val);
            if (node.right!=null) stack.push(node.right);
            if (node.left!=null) stack.push(node.left);
        }
        return res;
    }
}
