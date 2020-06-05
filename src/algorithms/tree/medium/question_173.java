package algorithms.tree.medium;

import algorithms.tree.TreeNode;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author haowus919@gmail.com
 * @date 2020/6/5 20:27
 */
public class question_173 {
    LinkedList<Integer> list = new LinkedList<>();
    public question_173(TreeNode root) {

        inorder(root);

    }

    /** @return the next smallest number */
    public int next() {

        return list.removeFirst();
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return list.size() > 0;
    }

    private void inorder(TreeNode root){
        if (root==null)
            return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}
