package leetcode_sf_offer;

/**
 * 剑指 Offer 22. 链表中倒数第k个节点
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/19 21:57
 */
public class IQ_22 {
    public ListNode getKthFromEnd(ListNode head, int k) {

        ListNode slow = head;
        ListNode fast = head;
        int count=0;
        while (count<k){
            fast = fast.next;
            count++;
        }
        while (fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
