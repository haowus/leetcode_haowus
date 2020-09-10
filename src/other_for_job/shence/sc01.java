package other_for_job.shence;

import java.util.*;

/**
 * @Author haowus919@gmail.com in lab
 * @Date 2020/8/26 16:55
 */
public class sc01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new TreeMap<>();//按键大小升序排序
        int res = 0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == '('){
                res ++;
                stack.push(i);
            }
            else if (s.charAt(i) == ')'){
                int cur = stack.peek();
                map.put(cur,i);
                stack.pop();
            }
        }
        System.out.println(res);
        for (int i:map.keySet()){
            System.out.println(i);
            System.out.println(map.get(i));
        }


    }
}
