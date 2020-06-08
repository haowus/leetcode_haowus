package algorithms.tree.easy;

import algorithms.tree.TreeNode;

/**
 * @author haowus919@gmail.com
 * @date 2020/6/8 22:21
 */
public class question_437 {
    public int pathSum(TreeNode root, int sum) {
        if (root==null) return 0;
//        int res = path(root,sum);
//        int a = pathSum(root.left,sum);
//        int b = pathSum(root.right,sum);
//        return res+a+b;
        return path(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);

    }
    private int path(TreeNode root,int sum){
        if (root==null) return 0;
        sum -= root.val;
        int result = sum==0?1:0;  //计数
        return result+path(root.left,sum)+path(root.right,sum);
    }
}
