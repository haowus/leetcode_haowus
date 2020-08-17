package other_for_job.qianxin;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/16 16:24
 */
public class qax02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        LinkedList<String> stack = new LinkedList<>();
        Stack<String> redo = new Stack<>();
        String[] str = s.split("\\s+");
        if (str.length==0) System.out.println("");
        for (int i=0;i< str.length;i++){
            String ss = str[i];
            if (ss.equals("undo")){
                // TODO: 2020/8/16;
                if (!stack.isEmpty())
                    redo.push(stack.pollLast());

            }
            else if (ss.equals("redo")){
                // TODO: 2020/8/16
                if (!redo.empty())
                    stack.push(redo.pop());
            }
            else {
                stack.push(ss);
            }
        }
        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()){
            sb.append(stack.pollFirst());
            sb.append(" ");
        }

        String res = sb.toString();
        System.out.println(res.trim());
    }
}
