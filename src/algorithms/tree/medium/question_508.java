package algorithms.tree.medium;

import algorithms.tree.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author haowus919@gmail.com
 * @date 2020/6/11 22:34
 */
public class question_508 {
    int max = 0;
    public int[] findFrequentTreeSum(TreeNode root) {

        if (root==null) return new int[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        subPath(root,map);
        List<Integer> list = new ArrayList<>();
        for (int i:map.keySet())
            if (map.get(i)==max)
                list.add(i);
        int[] res = new int[list.size()];
        for (int i=0;i<list.size();i++)
            res[i] = list.get(i);
        return res;
    }
    private int subPath(TreeNode root, HashMap<Integer,Integer> map){
        if (root==null) return 0;
        //求出当前节点为根的元素和
        int left = subPath(root.left,map);
        int right = subPath(root.right,map);
        int val = root.val+left+right;
        map.put(val,map.getOrDefault(val,0)+1);
        max = Math.max(map.get(val),max);

        return val;
    }
}
