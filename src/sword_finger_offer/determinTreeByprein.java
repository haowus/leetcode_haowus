package sword_finger_offer;

public class determinTreeByprein {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {

        //数组长度为0的时候要处理
        if(pre.length!=in.length||pre.length==0||in.length==0)
            return null;
        int rootVal = pre[0];
        //数组长度仅为1的时候就要处理
        if(pre.length == 1){
            return new TreeNode(rootVal);
        }

        TreeNode root = new TreeNode(rootVal);
        int len=0;
        while(in[len]!=root.val)
            len++;
        int [] in_before = new int[len];
        int [] in_later = new int[in.length-len-1];
        int [] pre_before = new int[len];
        int [] pre_later = new int[pre.length-len-1];
        for (int i=0;i<len;i++){
            in_before[i] = in[i];
            pre_before[i] = pre[i+1];
        }
        for (int i=len+1;i<in.length;i++){
            in_later[i-len-1] = in[i];
            pre_later[i-len-1] = pre[i];
        }
        root.left = reConstructBinaryTree(pre_before,in_before);
        root.right = reConstructBinaryTree(pre_later,in_later);

        return root;

    }
}
