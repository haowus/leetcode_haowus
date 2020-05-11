package sword_finger_offer;


public class copyList {
    //1.加入copy结点
    public void copyNodes(RandomListNode pHead){
        RandomListNode walkNode=pHead;
        while(walkNode!=null){
            RandomListNode cloneNode=new RandomListNode(walkNode.label);
            cloneNode.next=walkNode.next;
            walkNode.next=cloneNode;
            walkNode=cloneNode.next;
        }
    }
    //2.为新copy结点的random域指定值
    public void initRandom(RandomListNode pHead){
        RandomListNode walkNode=pHead;
        RandomListNode cwalkNode=pHead;
        while(walkNode!=null){
            cwalkNode=walkNode.next;
            if(walkNode.random!=null){
                cwalkNode.random=walkNode.random.next;
            }
            walkNode=cwalkNode.next;
        }
    }
    //3.将链表和其copy版本分为两个链表
    public RandomListNode split2list(RandomListNode pHead){
        RandomListNode cpHead=pHead.next;
        RandomListNode walkNode=pHead;
        RandomListNode cwalkNode=cpHead;
        while(walkNode!=null){
            walkNode.next=cwalkNode.next;
            walkNode=walkNode.next;
            if(walkNode==null){
                cwalkNode.next=null;
            }
            else{
                cwalkNode.next=walkNode.next;
                cwalkNode=cwalkNode.next;
            }
        }
        return cpHead;
    }
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null){
            return null;
        }
        copyNodes(pHead);
        initRandom(pHead);
        return split2list(pHead);
    }
    public static void main(String[]args){
        RandomListNode head = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);
        RandomListNode node4 = new RandomListNode(4);
        RandomListNode node5 = new RandomListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        head.random = node3;
        node2.random = node5;
        node4.random = node2;
        copyList s = new copyList();
        RandomListNode copyList=s.Clone(head);
        System.out.print(copyList.label + " ");
//            while (copyList != null)
//            {
//                System.out.print(copyList.label + " ")
//                copyList = copyList.next;
//            }
    }
}

