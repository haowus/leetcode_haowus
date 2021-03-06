package algorithms.array.easy;



public class add_two_numbers_2 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val = x;}
    }
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1,q = l2,curr = dummyHead;
        int carry = 0;
        while (p != null || q != null){
            int x = (p!=null)?p.val:0;
            int y = (q!=null)?q.val:0;
            int sum = x + y + carry;
            curr = new ListNode(sum % 10);
            curr = curr.next;
            carry = sum / 10;
            if(p!=null) p = p.next;
            if(q!=null) q = q.next;
        }
        if(carry > 0){
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

}
