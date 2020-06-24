package leetcode_sf_offer;

/**
 * 剑指 Offer 25. 合并两个排序的链表
 * @author haowus919@gmail.com in dormitory
 * @date 2020/6/20 11:41
 */
public class IQ_25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        //新建一个链表
        ListNode dummyHead = new ListNode(0);
        ListNode head = dummyHead;

        while (l1!=null && l2!=null){
            if (l1.val<l2.val){
                head.next = l1;
                l1 = l1.next;
                head = head.next;
            }else {
                head.next = l2;
                l2 = l2.next;
                head = head.next;
            }
        }
        if (l1!=null) head.next = l1;
        if (l2!=null) head.next =l2;
        return dummyHead.next;
    }
}
