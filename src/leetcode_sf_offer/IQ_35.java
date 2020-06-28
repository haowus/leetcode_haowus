package leetcode_sf_offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 35. 复杂链表的复制
 * @author haowus919@gmail.com in dormitory
 * @date 2020/6/26 20:00
 */
public class IQ_35 {
    public Node copyRandomList(Node head) {

        Map<Node,Node> map = new HashMap<>();
        Node cur = head;
        while (cur!=null){
            map.put(cur,new Node(cur.val));
            cur = cur.next;
        }
        cur = head;

        while (cur!=null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur =cur.next;
        }
        return map.get(head);


    }
}
