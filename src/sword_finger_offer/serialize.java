package sword_finger_offer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class serialize {
    String Serialize(TreeNode root) {

        //前序
        return upSeria(root,"");

    }
    private String upSeria(TreeNode root,String s){
        if (root ==null)
            s += "#!";
        else {
            s += root.val + "!";
            upSeria(root.left,s);
            upSeria(root.right,s);
        }
        return s;
    }
    TreeNode Deserialize(String str) {
        String[] nodes = str.split("!");
        List<String> node_list = new LinkedList<>(Arrays.asList(nodes));
        return reUpDeseria(node_list);
    }
    private TreeNode reUpDeseria(List<String> node_list){
        //当前节点为空
        if (node_list.get(0).equals("#")){
            node_list.remove(0);
            return null;
        }
        //总是根据首位元素确定当前子树的根
        TreeNode root = new TreeNode(Integer.valueOf(node_list.get(0)));
        node_list.remove(0);
        root.left = reUpDeseria(node_list);
        root.right = reUpDeseria(node_list);

        //返回当前的节点
        return root;
    }
}
