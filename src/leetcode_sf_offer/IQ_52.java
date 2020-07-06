package leetcode_sf_offer;

/**
 * 剑指 Offer 52. 两个链表的第一个公共节点
 * @author haowus919@gmail.com in dormitory
 * @date 2020/7/4 21:02
 */
public class IQ_52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode la = headA;
        ListNode lb = headB;

        while (la != lb){
            la = la==null?headB:la.next;
            lb = lb==null?headA:lb.next;
        }
        return la;
    }
}
