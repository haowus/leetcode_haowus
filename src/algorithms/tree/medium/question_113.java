package algorithms.tree.medium;

import algorithms.tree.ConstructTree;
import algorithms.tree.TreeNode;
import algorithms.tree.easy.orderTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author haowus919@gmail.com
 * @date 2020/6/1 22:38
 */
public class question_113 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {


        List<Integer> list = new ArrayList<>();
        ispath(root,sum,list);
        return res;

    }

    private void ispath(TreeNode root,int sum,List<Integer> list){

        if (root==null) {
            return;
        }

        sum -= root.val;
        list.add(root.val);

        if (root.left==null && root.right==null && sum==0){
            res.add(list);
        }

        ispath(root.left,sum,new ArrayList<>(list));
        ispath(root.right,sum,new ArrayList<>(list));

    }

    public static void main(String[] args) {

        Integer[] nums = {5,4,8,11,null,13,4,7,2,null,null,5,1};
        TreeNode root = ConstructTree.constructTree(nums);
//        depth depth = new depth();
//        System.out.println(depth.maxDepth(root));
        question_113 q113 = new question_113();
        System.out.println(q113.pathSum(root,22));

    }
}
