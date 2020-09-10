package other_for_job;

import java.util.Stack;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/9/6 16:57
 */
public class wm02 {
    public static String reverseWord (String str) {
        // write code here
        int left=0,right=str.length()-1;

        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        while (left<right){

            while (str.charAt(left)!=' '&&left<right){
                stack.push(str.charAt(left));
                left++;
            }
            left+=1;
            StringBuilder word = new StringBuilder();
            while (!stack.isEmpty())
                word.append(stack.pop());
            res.append(word).append(" ");


        }
        return res.deleteCharAt(res.length()-1).append(str.charAt(right)).toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWord("There is a dog."));
    }
}
