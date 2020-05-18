package top_interview_question;

public class question_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode cur = temp;
        while(l1!=null && l2!= null){
            if (l2.val>=l1.val){
                cur.next = l1;
                l1 = l1.next;
                cur = cur.next;
            }
            else{
                cur.next = l2;
                l2 = l2.next;
                cur = cur.next;
            }
        }
        if (l1!=null) cur.next = l1;
        if (l2!=null) cur.next = l2;
        return temp.next;
    }

}
