package algorithms.tree.test;

import algorithms.tree.ConstructTree;
import algorithms.tree.TreeNode;
import algorithms.tree.easy.orderTree;
import algorithms.tree.medium.question_129;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author haowus919@gmail.com
 * @date 2020/6/4 20:22
 */
public class question_129Test {

    @Test
    public void testsumNumbers() {
        Integer[] nums = {4,9,0,5,1};
        TreeNode root = ConstructTree.constructTree(nums);
        question_129 q129 = new question_129();
        q129.sumNumbers(root);

    }
}