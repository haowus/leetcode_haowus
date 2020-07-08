package leetcode_sf_offer;

/**
 * 剑指 Offer 55 - I. 二叉树的深度
 * @author haowus919@gmail.com in dormitory
 * @date 2020/7/7 22:29
 */
public class IQ_55_I {
    private int count,res;
    public int maxDepth(TreeNode root) {
        //迭代 非递归
//        if (root==null) return 0;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        int depth=1;
//        while (!queue.isEmpty()){
//            int size = queue.size();
//
//            while (size>0){
//                TreeNode node = queue.poll();
//                if (node.left!=null) queue.add(node.left);
//                if (node.right!=null) queue.add(node.right);
//                size--;
//            }
//            depth++;
//        }
//        return depth;

        //递归
//        if (root==null) return 0;
//        int left = maxDepth(root.left); //左子树的深度
//        int right = maxDepth(root.right); //右子树的深度
//        return left>right?left+1:right+1;

        return root==null?0:Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

}
