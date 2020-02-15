package algorithms.string.easy;

import java.util.Stack;

public class validCharacter {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (char c:s.toCharArray()){
            if (c=='(')
                stack.push(')');
            else if (c=='[')
                stack.push(']');
            else if (c=='{')
                stack.push('}');
            else if (stack.isEmpty()||c!=stack.pop())//当运行到判断是不是等于pop()后，不管是不是，stack中大小已经减一
                return false;
        }
        return stack.isEmpty();
    }
}
