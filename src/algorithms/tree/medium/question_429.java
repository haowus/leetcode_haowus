package algorithms.tree.medium;

import algorithms.tree.NTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author haowus919@gmail.com
 * @date 2020/6/8 22:04
 */
public class question_429 {
    public List<List<Integer>> levelOrder(NTreeNode root) {


        List<List<Integer>> res =new ArrayList<>();
        if(root==null) return res;
        Queue<NTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){

            int size = queue.size();
            List<Integer> subList = new ArrayList<>();
            while (size>0){
                NTreeNode node = queue.poll();
                subList.add(node.val);
                while (!node.children.isEmpty())
                    queue.add(node.children.remove(0));

                size--;
            }
            res.add(subList);
        }
        return res;
    }
    private void level(NTreeNode root){

    }
}
