package sword_finger_offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class printTree {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        ArrayList<Integer> res = new ArrayList<>();
        if (root==null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            res.add(temp.val);
            if (temp.left!=null) queue.offer(temp.left);
            if (temp.right!=null) queue.offer(temp.right);
        }
        return res;
    }
}
