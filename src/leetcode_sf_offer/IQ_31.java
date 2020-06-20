package leetcode_sf_offer;

import java.util.Stack;

/**
 * 剑指 Offer 31. 栈的压入、弹出序列
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/20 20:14
 */
public class IQ_31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> stack = new Stack<>();
        int count=0;
        for (int element:pushed){
            stack.push(element);
            while (count<popped.length &&!stack.empty() && stack.peek()==popped[count]){
                stack.pop();
                count++;
            }
        }
        return count==popped.length;
    }
}
