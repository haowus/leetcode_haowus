package algorithms.tree;

import java.util.List;

/**
 * @author haowus919@gmail.com
 * @date 2020/6/8 22:03
 */
public class NTreeNode {
    public int val;
    public List<NTreeNode> children;

    public NTreeNode() {}

    public NTreeNode(int _val) {
        val = _val;
    }

    public NTreeNode(int _val, List<NTreeNode> _children) {
        val = _val;
        children = _children;
    }
}
