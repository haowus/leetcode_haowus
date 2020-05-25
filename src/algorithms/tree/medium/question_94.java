package algorithms.tree.medium;

import algorithms.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class question_94 {


//    //中序遍历
//    List<Integer> res = new ArrayList<>();
//    private List<Integer> inorderTraversal(TreeNode root) {
//
//        if (root==null) return res;
//
//
//        if (root.left!=null)
//            inorderTraversal(root.left);
//        res.add(root.val);
//        if (root.right!=null)
//            inorderTraversal(root.right);
//
//        return res;
//
//    }

//    public List<Integer> inorderTraversal(TreeNode root){
//        List<Integer> res = new ArrayList<>();
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode cur = root;
//        while (cur!=null || !stack.isEmpty()){
//            while (cur!=null){
//                stack.push(cur);
//                cur = cur.left;
//            }
//            cur = stack.pop();
//            res.add(cur.val);
//            cur = cur.right;
//        }
//        return res;
//    }

    //莫里斯遍历   改变二叉树的结构，使之变成链表。
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        TreeNode pre = null;
        while (root!=null){
            if (root.left!=null){
                pre = root.left;
                while (pre!=null){
                    pre = pre.right;   //一直找到左节点的最右节点
                }
                pre.right = root;

                TreeNode tmp = root;
                root = root.left;   //先将当前节点移到当前节点的左子节点
                tmp.left = null;    //然后把之前节点的左子树删去，以防形成回路
            }
            else {
                res.add(root.val);
                root = root.right;
            }
        }
        return res;
    }
}
