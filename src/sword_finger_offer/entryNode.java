package sword_finger_offer;

import java.util.ArrayList;

public class entryNode {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ArrayList<ListNode> al = new ArrayList<>();
        while (pHead!=null&&!al.contains(pHead)){
            al.add(pHead);
            pHead = pHead.next;
        }
        return pHead;

    }
}
