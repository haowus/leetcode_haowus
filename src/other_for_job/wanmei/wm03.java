package other_for_job.wanmei;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/25 20:07
 */
public class wm03 {
    static boolean isValidPop(int[] push, int[] pop) {
        int len = push.length;
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i : push) {
            stack.push(i);
            while (!stack.isEmpty() && index < len && stack.peek() == pop[index]) {
                stack.pop();
                index++;
            }
        }
        return index == len;

    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean res;

        int _push_size = 0;
        _push_size = Integer.parseInt(in.nextLine().trim());
        int[] _push = new int[_push_size];
        int _push_item;
        for(int _push_i = 0; _push_i < _push_size; _push_i++) {
            _push_item = Integer.parseInt(in.nextLine().trim());
            _push[_push_i] = _push_item;
        }

        int _pop_size = 0;
        _pop_size = Integer.parseInt(in.nextLine().trim());
        int[] _pop = new int[_pop_size];
        int _pop_item;
        for(int _pop_i = 0; _pop_i < _pop_size; _pop_i++) {
            _pop_item = Integer.parseInt(in.nextLine().trim());
            _pop[_pop_i] = _pop_item;
        }

        res = isValidPop(_push, _pop);
        System.out.println(String.valueOf(res ? 1 : 0));
    }
}
