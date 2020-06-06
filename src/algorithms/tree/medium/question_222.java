package algorithms.tree.medium;

import algorithms.tree.TreeNode;

import java.util.*;

/**
 * @author haowus919@gmail.com
 * @date 2020/6/6 19:48
 */
public class question_222 {

    public int countNodes(TreeNode root) {

        if (root==null) return 0;

        return  1 + countNodes(root.right) + countNodes(root.left);
    }
}
