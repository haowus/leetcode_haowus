package top_interview_question;

public class question_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode rec=new ListNode(0);
        rec.next=head;
        ListNode slow,fast;
        slow = fast = rec;   //快慢指针

        while(n-- > 0){
            fast = fast.next;
        }
        while(fast !=null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode curr = head;
        while(curr.next!=slow){
            curr = curr.next;
        }
        curr.next = slow.next;
        return rec.next;

    }
}
