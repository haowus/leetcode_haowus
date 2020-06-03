package algorithms.tree.medium;
import algorithms.tree.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author haowus919@gmail.com
 * @date 2020/6/3 21:28
 */
public class question_116 {
    public Node connect(Node root) {


//队列  层次遍历
//        if (root==null) return root;
//        Queue<Node> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()){
//            int size = queue.size();
//            Node nextNode= null;
//
//            while (size>0){
//                Node cur = queue.poll();
//                if (cur.right!=null) queue.add(cur.right);
//                if (cur.left!=null) queue.add(cur.left);
//
//                cur.next=nextNode;
//                nextNode = cur;
//                size--;
//            }
//        }
//        return root;


        //递归
        if (root==null) return null;

        if (root.left!=null) root.left.next = root.right;
        if (root.right!=null && root.next!=null) root.right.next = root.next.left;

        connect(root.left);
        connect(root.right);

        return root;

    }
}
