package other_for_job.xiecheng;

import java.util.List;

/**
 * 计算工作流中最大的执行时间
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/15 19:10
 */

class mulTreeNode{
    public int val;
    public List<mulTreeNode> children;
    public mulTreeNode() {}
    public mulTreeNode(int val) {
        this.val = val;
    }
    public mulTreeNode(int val, List<mulTreeNode> children) {
        this.val = val;
        this.children = children;
    }
}
public class xc01 {
    public static void main(String[] args) {
        String regex = "HEAD'0'A,B,C|A'20'END|B'100'END|C'50'D,E|D'80'F|E'150'END|F'30'END";
        String[] s = regex.split("|");
        mulTreeNode HEAD = new mulTreeNode(0);
        String str_h = s[0].substring(7);

    }
}
