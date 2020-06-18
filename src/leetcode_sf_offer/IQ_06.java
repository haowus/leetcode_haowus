package leetcode_sf_offer;

import java.util.Stack;

/**
 * 面试题06. 从尾到头打印链表
 * 入栈的思想  先进后出
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/17 20:34
 */
public class IQ_06 {
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head!=null){
            stack.push(head);
            head = head.next;
        }
        int count = 0;
        int [] res = new int[stack.size()];
        while (!stack.isEmpty())
            res[count++] = stack.pop().val;
        return res;
    }
}
