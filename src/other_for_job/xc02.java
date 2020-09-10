package other_for_job;

/**
 * abdef
 * abdaf--circular dependency
 * abdgf
 * acdef
 * acdaf--circular dependency
 * acdgf
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/9/8 20:17
 */
public class xc02 {
    static LinkedList<String> res = new LinkedList<>();
    static LinkedList<Boolean> flag = new LinkedList<>();
    static StringBuilder temp = new StringBuilder();
    static HashMap<Character, Integer> map = new HashMap<>();
    static String[] arr;
    static int n;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();
            arr = line.split(" ");
            n = arr.length;
            dfs(0, true);
            for (; res.size()>0; ) {
                System.out.print(res.removeFirst());
                if (!flag.removeFirst()) {
                    System.out.println("--circular dependency");
                } else {
                    System.out.println();
                }
            }
        }
    }

    public static void dfs(int cur, boolean f) {

        if (cur == n) {
            res.add(temp.toString());
            flag.add(f);
            return;
        }
        String str = arr[cur];
        for (int i = 0; i< str.length(); i++) {

            boolean tf = f;
            char ch = str.charAt(i);
            Integer c;
            if ((c = map.get(ch)) != null && c > 0) {
                tf = false;
            }
            map.put(ch, c==null ? 1 : c+1);
            temp.append(ch);

            dfs(cur+1, tf);
            temp.deleteCharAt(temp.length()-1);
            map.put(ch, c);
        }
    }
}
