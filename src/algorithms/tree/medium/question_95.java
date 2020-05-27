package algorithms.tree.medium;

import algorithms.tree.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class question_95{

    public List<TreeNode> generateTrees(int n) {
        if (n==0) return Collections.emptyList();
        return generateTrees(1,n);

    }

    private List<TreeNode> generateTrees(int l,int r) {
        ArrayList<TreeNode> res = new ArrayList<>();

        if (l>r){
            res.add(null);
            return res;
        }

        for (int i=l; i<=r;i++){
            List<TreeNode> left = generateTrees(l,i-1);   //以i为根节点的所有左子树集合
            List<TreeNode> right = generateTrees(i+1,r);   //以i为根节点的所有右子树集合


            for (TreeNode ll:left)
                for (TreeNode rr:right) {
                    TreeNode root = new TreeNode(i);
                    root.left = ll;
                    root.right = rr;
                    res.add(root);
                }
        }

        return res;

    }

    public static void main(String[] args) {
        question_95 q95 = new question_95();
        q95.generateTrees(3);
    }
}