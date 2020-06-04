package algorithms.tree.medium;

import algorithms.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author haowus919@gmail.com
 * @date 2020/6/4 22:47
 */
public class question_145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        LinkedList<Integer> res = new LinkedList<>();

        if (root==null) return res;

        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            res.addFirst(node.val);

            if (node.left!=null) stack.push(node.left);
            if (node.right!=null) stack.push(node.right);
        }

        return res;
    }
}
