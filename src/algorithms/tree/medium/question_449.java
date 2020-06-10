package algorithms.tree.medium;

import algorithms.tree.TreeNode;

/**
 * @author haowus919@gmail.com
 * @date 2020/6/10 20:15
 */
public class question_449 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root==null) return "";
        StringBuilder sb = new StringBuilder();
        preorder(root,sb);
        return sb.substring(0,sb.length()-1);
    }

    //前序遍历
    private void preorder(TreeNode root,StringBuilder sb){
        if (root==null) return;

        sb.append(root.val).append(",");
        preorder(root.left,sb);
        preorder(root.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data==null || data.length()==0) return null;
        String[] arr = data.split(",");
        return buider(arr,0,arr.length-1);
    }

    //构建树
    private TreeNode buider(String[] arr,int lo,int hi){
        if (lo>hi) return null;
        TreeNode root = new TreeNode(Integer.valueOf(arr[lo]));
        int index = hi+1;
        for (int i=lo+1;i<=hi;i++){
            if (Integer.valueOf(arr[i])>root.val){
                index = i;
                break;
            }
        }
        //递归构建子树
        root.left = buider(arr,lo+1,index-1);
        root.right= buider(arr,index,hi);
        return root;
    }
}
