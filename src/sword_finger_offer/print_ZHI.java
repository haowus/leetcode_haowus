package sword_finger_offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class print_ZHI {

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>> out = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        int sum = 1;  //第一层 根节点 只有一个

        int num =1;  //记录该层为奇偶层?

        while (!queue.isEmpty() && pRoot!=null){
            ArrayList<Integer> in = new ArrayList<>();
            int temp = 0; //记录每层多少个节点
            while (sum>0){
                TreeNode node = queue.poll();
                assert node != null;
                in.add(node.val);
                if (node.left!=null) {
                    queue.add(node.left);
                    temp++;
                }
                if (node.right!=null) {
                    queue.add(node.right);
                    temp++;
                }
                sum--;
            }
            sum = temp;
            if (num%2==0){
                for (int i=0,j=in.size()-1;i<j;i++,j--){
                    int tem = in.get(i);
                    in.set(i,in.get(j));
                    in.set(j,tem);
                }
            }
            out.add(in);
            num++;

        }
        return out;

    }

}
