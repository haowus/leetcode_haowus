package sword_finger_offer;

public class firstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1==null||pHead2==null) return null;

        int count1=0,count2=0;
        ListNode tHead1 = pHead1;
        ListNode tHead2 = pHead2;
        //求pHead1链表的长度
        while (tHead1!=null){
            count1++;
            tHead1 = tHead1.next;
        }
        //求pHead2链表的长度
        while (tHead2!=null){
            count2++;
            tHead2 = tHead2.next;
        }

        int diff = count1 - count2;
        if (diff>0){
            while (diff-->0)
                pHead1 = pHead1.next;
        }else {
            while (diff++<0)
                pHead2 = pHead2.next;
        }
        while (pHead1!=null && pHead2!=null){
            if (pHead1.val == pHead2.val)
                return pHead1;
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return null;

    }
}
