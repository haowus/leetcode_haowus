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

        Stack<Integer> stack = new Stack<>();
        int root = Integer.MAX_VALUE;
        for (int i=postorder.length-1;i>=0;i--){
            if (postorder[i]>root) return false;
            while (!stack.empty() && postorder[i]<stack.peek())
                root=stack.pop();
             stack.push(postorder[i]);
        }
        return true;
    }
}
