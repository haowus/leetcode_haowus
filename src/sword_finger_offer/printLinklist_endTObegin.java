package sword_finger_offer;


import java.util.ArrayList;
import java.util.Iterator;



public class printLinklist_endTObegin {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> list = new ArrayList<>();
        if(listNode==null) return new ArrayList<>();
        while (listNode!=null){
            list.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> listNew = new ArrayList<>();
        for (int i=list.size()-1;i>=0;i--)
            listNew.add(list.get(i));
        return listNew;
    }
}
