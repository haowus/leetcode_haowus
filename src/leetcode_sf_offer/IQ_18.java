package leetcode_sf_offer;

/**
 * 面试题18. 删除链表的节点
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/19 20:59
 */
public class IQ_18 {
    public ListNode deleteNode(ListNode head, int val) {

        if(head.val==val) return head.next;
        ListNode cur = head;

        while (cur.next.val!=val){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;

    }
}
