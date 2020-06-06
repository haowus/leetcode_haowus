package algorithms.tree.medium;

import algorithms.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author haowus919@gmail.com
 * @date 2020/6/6 21:54
 */
public class question_230 {
    private int count=0;
    private int res ;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return res;
    }

    private void inorder(TreeNode root,int k){
        if (root==null) return;

        inorder(root.left,k);
        count++;
        if (count==k) {
            res = root.val;
            return;
        }
        inorder(root.right,k);
    }
}
