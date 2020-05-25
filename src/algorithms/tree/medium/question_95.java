package algorithms.tree.medium;

import algorithms.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class question_95 {
    List<TreeNode> res = new ArrayList<>();
    public List<TreeNode> generateTrees(int n) {

        int[] num = new int[n];
        for (int i=0;i<n;i++)
            num[i] = i+1;
        TreeNode path = new TreeNode(0);
        backtrack(path,num,n,0);

        return res;
    }

    void backtrack(TreeNode path,int[] num,int n,int count){

        if(count==n && isBST(path)){
            res.add(path);
            return;
        }

        for (int i=0;i<num.length;i++){
            while (path!=null){
                if (num[i]<path.val){
                    if (path.left==null){
                        path.left = new TreeNode(num[i]);
                        backtrack(path,num,n,count+1);
                        path.left=null;
                    }
                    else
                        path = path.left;
                }else if(num[i]>path.val){
                    if (path.right==null){
                        path.right = new TreeNode(num[i]);
                        backtrack(path,num,n,count+1);
                        path.right=null;
                    }
                    else
                        path = path.right;
                }else
                    break;
            }
        }


    }

    boolean isBST(TreeNode path){


        if(path.val > path.left.val && path.val<path.right.val)
            return true;

        return isBST(path.left) && isBST(path.right);
    }
}
