package top_interview_question;

import java.util.PriorityQueue;

public class question_23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;
        if(lists.length == 1)
            return lists[0];
        if(lists.length == 2){
            return mergeTwoLists(lists[0],lists[1]);
        }

        int mid = lists.length/2 ;
        ListNode[] left = new ListNode[mid];
        ListNode[] right = new ListNode[lists.length-mid];
        for (int i = 0; i < lists.length;i++){
            if (i<mid)
                left[i] = lists[i];
            else
                right[i-mid] = lists[i];
        }

        return mergeTwoLists(mergeKLists(left),mergeKLists(right));


    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode temp = new ListNode(0);
//        ListNode cur = temp;
//        while(l1!=null && l2!= null){
//            if (l2.val>=l1.val){
//                cur.next = l1;
//                l1 = l1.next;
//                cur = cur.next;
//            }
//            else{
//                cur.next = l2;
//                l2 = l2.next;
//                cur = cur.next;
//            }
//        }
//        if (l1!=null) cur.next = l1;
//        if (l2!=null) cur.next = l2;
//        return temp.next;
        if (l1==null) return l2;
        if (l2==null) return l1;
        ListNode head = null;
        if (l1.val<=l2.val){
            head = l1;
            head.next = mergeTwoLists(l1.next,l2);
        } else {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }
        return head;
    }
}
