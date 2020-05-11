package sword_finger_offer;

import java.util.ArrayList;
import java.util.Stack;

public class reverseListNode {
    public ListNode ReverseList(ListNode head) {
        if(head==null||head.next==null) return head;  //若链表为空或者长度为1，返回本身
        ListNode pre=null;
        ListNode next;
        while (head!=null){
            next = head.next;  //当前节点的下一个节点存放在next中
            head.next=pre;   //把pre赋值给当前节点的下一个节点；
            pre = head;       //再把当前节点指向pre；
            head = next;      //把当前节点移到当前节点的下一个节点
        }
        return pre;
    }
}
