package other_for_job.youzan;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/20 19:23
 */

class ListNode {
   int val;
   ListNode next = null;
 }
public class yz01 {
    /**
     * 判断是否为回文链表
     * @param head ListNode类 链表头
     * @return bool布尔型
     */
    public boolean isPalindrome (ListNode head) {
        // write code here

//        if (head == null || head.next == null) return true;
//        ListNode p = head, q = head, pre = null;
//        while (p != null && q.next != null) {
//            q = q.next.next;
//            ListNode temp = p.next;
//            p.next = pre;
//            pre = p;
//            p = temp;
//        }
//        if (q != null) p = p.next;
//        while (p != null && pre != null) {
//            if (p.val != pre.val)
//                return false;
//            p = p.next;
//            pre = pre.next;
//        }
//        return true;
        if (head == null || head.next == null) return true;
        ListNode cur = head;
        List<Integer> res = new ArrayList<>();
        while (cur!=null){
            res.add(cur.val);
            cur=cur.next;
        }
        int i=0,j=res.size()-1;
        while (i<j){
            if (!res.get(i).equals(res.get(j)))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
