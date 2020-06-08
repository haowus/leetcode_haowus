package algorithms.tree.easy;

import algorithms.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author haowus919@gmail.com
 * @date 2020/6/8 21:00
 */
public class question_257 {
    List<String> res = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root==null) return res;
        StringBuilder sb = new StringBuilder();
        path(root,sb);
        return res;

    }
    private void path(TreeNode root,StringBuilder sb){
        sb.append(root.val);
        sb.append("->");
        if (root.left==null && root.right==null) {
            int len = sb.length();
            sb.delete(len-2,len);
            res.add(sb.toString());
            return;
        }

        if (root.left!=null)
            path(root.left,new StringBuilder(sb));
        if (root.right!=null)
            path(root.right,new StringBuilder(sb));
    }
}
