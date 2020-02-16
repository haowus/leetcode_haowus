package algorithms.string.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class reverseVo {
    public String reverseVowels(String s) {

        Stack<Character> stack = new Stack<>();
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('u');
        set.add('o');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('U');
        set.add('O');
        for (int i=0;i<s.length();i++){
            if (set.contains(s.charAt(i)))
                stack.push(s.charAt(i));
        }
        char[] ans = s.toCharArray();
        for (int i=0;i<ans.length;i++){
            if (set.contains(ans[i]))
                ans[i] = stack.pop();
        }
        return new String(ans);

    }
}
