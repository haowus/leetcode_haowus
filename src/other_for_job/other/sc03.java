package other_for_job.other;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 神策  字符串全排列
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/9/2 12:22
 */
public class sc03 {
    static List<String> res = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        backtrack(s,sb);
//        System.out.println(res);
        System.out.print("[");
        for (int i=0;i<res.size()-1;i++){
            System.out.print("'"+res.get(i)+"',");
        }
        System.out.print("'"+res.get(res.size()-1)+"'");
        System.out.print("]");


    }
    private static void backtrack(String s,StringBuilder sb){
        if (s.length()==sb.length()){
            res.add(new StringBuilder(sb).toString());
            return;
        }
        for (int i=0;i<s.length();i++){
            if (!isExit(s.charAt(i),sb))
                continue;
            sb.append(s.charAt(i));
            backtrack(s,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    private static boolean isExit(char c,StringBuilder sb){
        for (int i=0;i<sb.length();i++)
            if (sb.charAt(i)==c)
                return false;
        return true;
    }

}
