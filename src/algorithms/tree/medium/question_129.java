package algorithms.tree.medium;

import algorithms.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author haowus919@gmail.com
 * @date 2020/6/4 20:03
 */
public class question_129 {
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        path(root,0);

        return sum;
    }

    private void path(TreeNode root,int val){
        if (root==null) {
            return;
        }
        int k = val*10+root.val;
        if (root.left==null && root.right==null){
            sum += k;
        }

        path(root.left,k);
        path(root.right,k);

    }
}
