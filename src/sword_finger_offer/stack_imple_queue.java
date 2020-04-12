package sword_finger_offer;

import java.util.Arrays;
import java.util.Stack;

public class stack_imple_queue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);

    }

    public int pop() {

        if (stack2.size()<=0){
            while (!stack1.empty())
                stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        Arrays.sort(new int[]{3,4,5,1,2});
    }
}
