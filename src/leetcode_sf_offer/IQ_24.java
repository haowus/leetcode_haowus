package leetcode_sf_offer;

/**
 * 剑指 Offer 24. 反转链表
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/19 22:12
 */
public class IQ_24 {
    public ListNode reverseList(ListNode head) {

        ListNode cur =head,pre = null,next = null;

        while (cur!=null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
