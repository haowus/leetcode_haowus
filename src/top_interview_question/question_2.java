package top_interview_question;

public class question_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry =0;
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (l1!=null || l2!=null){
            int sum =0;
            if (l1==null)
                sum = l2.val+carry;
            else if (l2==null)
                sum = l1.val+carry;
            else {
                sum = l1.val+l2.val+carry;
            }
            if (sum/10!=0){
                carry =1;
                sum = sum%10;
            }
            else
                carry=0;
            ListNode res = new ListNode(sum);
            cur.next = res;
            cur = res;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if (carry==1){

            cur.next = new ListNode(1);
        }
        return head.next;
    }
}
