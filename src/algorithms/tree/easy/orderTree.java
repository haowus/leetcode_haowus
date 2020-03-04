package algorithms.tree.easy;

import algorithms.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class orderTree {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        LinkedList<List<Integer>> result = new LinkedList<>();
        if (root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();   //队列  FIFO先进先出
        queue.add(root);                // LinkedList类实现了Queue接口，因此可以把LinkedList当成Queue来用
        while (!queue.isEmpty()) {
            List<Integer> oneLevel = new ArrayList<>();
            // 每次都取出一层的所有数据
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                TreeNode node = queue.poll();     //删除并返回队列queue的第一个元素
                oneLevel.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            // 每次都往队头塞
            result.addFirst(oneLevel);
        }
        return result;
    }

}
