package algorithms.tree.test;

import algorithms.tree.ConstructTree;
import algorithms.tree.TreeNode;
import algorithms.tree.medium.question_129;
import algorithms.tree.medium.question_144;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author haowus919@gmail.com
 * @date 2020/6/4 21:06
 */
public class question_144Test {

    @Test
    public void preorderTraversal() {

        Integer[] nums = {1,2,3,4,5,6,null,null,null,null,null,7};
        TreeNode root = ConstructTree.constructTree(nums);
        question_144 q144 = new question_144();
        System.out.println(q144.preorderTraversal(root));
    }
}