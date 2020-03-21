package algorithms.tree.easy;

import algorithms.tree.TreeNode;

public class sortarrayTobst {
    public TreeNode sortedArrayToBST(int[] nums){
        return nums==null?null:buildTree(nums,0,nums.length-1);

    }
    public TreeNode buildTree(int[] nums,int l,int r){
        if (l>r) return null;
        int m = l + (r-l)/2;
        TreeNode root = new TreeNode(nums[m]);  //创建一个根节点是nums[m]的树
        root.left = buildTree(nums,l,m-1);
        root.right = buildTree(nums,m+1,r);
        return root;
    }
}
