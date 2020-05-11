package sword_finger_offer;

public class deleteDupNode {
    public ListNode deleteDuplication(ListNode pHead)
    {

        ListNode root = new ListNode(Integer.MAX_VALUE);
        root.next = pHead;
        ListNode pre = root;
        ListNode cur = root.next;
        while (cur !=null){
            while (cur.next!=null && cur.val==cur.next.val)
                cur = cur.next;
            cur = cur.next;
            if (cur!=null && cur.next!=null && cur.val == cur.next.val)
                continue;

            pre.next = cur;
            pre = pre.next;
        }
        return root.next;

    }
}
