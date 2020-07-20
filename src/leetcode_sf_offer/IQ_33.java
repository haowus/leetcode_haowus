package leetcode_sf_offer;

import java.util.Stack;

/**
 * 剑指 Offer 33. 二叉搜索树的后序遍历序列
 * @author haowus919@gmail.com in dormitory
 * @date 2020/6/20 21:37
 * 真难
 */
public class IQ_33 {
    public boolean verifyPostorder(int[] postorder) {
//单调栈
//        Stack<Integer> stack = new Stack<>();
//        int root = Integer.MAX_VALUE;
//        for (int i=postorder.length-1;i>=0;i--){
//            if (postorder[i]>root) return false;
//            while (!stack.empty() && postorder[i]<stack.peek())
//                root=stack.pop();
//            stack.push(postorder[i]);
//        }
//        return true;

        //递归
        return verifyPostorder(postorder,0,postorder.length-1);
    }

    private boolean verifyPostorder(int[] postorder, int i, int j) {

        if (i>=j) return true;

        int cur = i;   //cur:移动指针
        while (postorder[cur]<postorder[j])
            cur++;     //直到找到第一个大于根节点的位置，跳出循环
        int m = cur;   //用m记录左右子树的分隔位置
        while (postorder[cur]>postorder[j])
            cur++;     //检查右子树中是否有不符合BST的节点，若有，则跳出后cur!=j
        return cur==j && verifyPostorder(postorder,i,m-1) && verifyPostorder(postorder,m,j-1);

    }
}
