package leetcode_sf_offer;

import java.util.Stack;

/**
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/20 18:10
 */
public class IQ_30 {
    Stack<Integer> A;
    Stack<Integer> B;
    public IQ_30() {
        A = new Stack<>();
        B = new Stack<>();
    }

    public void push(int x) {
        A.push(x);
        if (B.empty() || x<=B.peek())
            B.push(x);

    }

    public void pop() {
        if (A.pop().equals(B.peek()))   //如果一个数AB里面都有，则都要出栈
            B.pop();
    }

    public int top() {
        return A.peek();
    }

    public int min() {
        return B.peek();
    }
}
