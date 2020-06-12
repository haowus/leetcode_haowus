package algorithms.tree.medium;

import algorithms.tree.TreeNode;

/**
 * @author haowus919@gmail.com
 * @date 2020/6/12 21:07
 */
public class question_513 {
    int depth=-1;
    int res;
    public int findBottomLeftValue(TreeNode root) {

//        //层序遍历  BFS
//        Queue<TreeNode> queue = new LinkedList<>();
//
//        queue.add(root);
//        while (!queue.isEmpty()){
//
//            root = queue.poll();
//            if (root.right!=null) queue.add(root.right);
//            if (root.left!=null) queue.add(root.left);
//
//        }
//
//        return root.val;

        //递归  DFS
        dfs(root,0);
        return res;

    }
    private void dfs(TreeNode root,int height){

        if (root==null) return;
        if (height>depth){
            depth = height;
            res = root.val;
        }
        dfs(root.left,height+1);//向左子树进入，高度值加1
        dfs(root.right,height+1);
    }
}
