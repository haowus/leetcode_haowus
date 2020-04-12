package sword_finger_offer;

import java.util.Stack;

public class inout_stack {
    public boolean IsPopOrder(int [] pushA,int [] popA) {

        Stack<Integer> s = new Stack<>();
        for (int i=0,j=0;i<pushA.length;i++){
            s.push(pushA[i]);
            while (j<pushA.length&&s.peek()==popA[j]){
                s.pop();
                j += 1;
            }
        }
        return s.empty();
    }
}
