package sword_finger_offer;

public class getNode_next {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {

        //右子树不为空，则返回右子树的最左的节点
        if (pNode.right!=null){
            pNode = pNode.right;
            while (pNode.left!=null)
                pNode = pNode.left;
            return pNode;
        }

        //右子树为空

        //该节点是父节点的左孩子，则返回父节点

        if (pNode.next!=null && pNode.next.left==pNode)
            return pNode.next;

        //该节点是父节点的右孩子，则返回父节点的父节点
        if(pNode.next !=null){
            pNode = pNode.next;
            while (pNode.next!=null && pNode.next.right== pNode)  //(循环往上面找)
                pNode = pNode.next;
            return pNode.next;
        }
        return null;


    }
}
