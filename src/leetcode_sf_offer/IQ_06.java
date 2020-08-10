package leetcode_sf_offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题06. 从尾到头打印链表
 * 入栈的思想  先进后出
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/17 20:34
 * 递归本质上是一个栈结构  所以能用栈实现，也能用递归实现
 */
public class IQ_06 {
    List<Integer> res = new ArrayList<>();
    public int[] reversePrint(ListNode head) {
//        Stack<ListNode> stack = new Stack<>();
//        while (head!=null){
//            stack.push(head);
//            head = head.next;
//        }
//        int count = 0;
//        int [] res = new int[stack.size()];
//        while (!stack.isEmpty())
//            res[count++] = stack.pop().val;
//        return res;


        //递归
        recursive(head);
        int[] out = new int[res.size()];
        for (int i=0;i<res.size();i++)
            out[i] = res.get(i);
        return out;


    }

    private void recursive(ListNode head){
        if (head!=null){
            if (head.next!=null)
                recursive(head.next);
            res.add(head.val);
        }
    }
}
