package sword_finger_offer;

public class mergeTwo_ListNode {
    public ListNode Merge(ListNode list1,ListNode list2) {


//        把list2往list1的中插。
//        比较list2与list1的值：
//        当list2值小等于list1值时往list1的前面插，并让list2指向下一个元素
//        否则不进行插入，list1指向下一个结点。
//        重复上述操作，直到有一个链表为空
//        判断是哪个链表空了，如果是list2则说明list2已全部插入直接返回头结点即可。如果是list1，则将剩下的list2结点直接连到list1尾部，返回头结点即可。

        if(list1==null) return list2;
        if(list2==null) return list1;

        if (list1.val<list2.val){
            list1.next = Merge(list1.next,list2);
            return list1;
        }
        else{
            list2.next = Merge(list1,list2.next);
            return list2;
        }


    }
}
