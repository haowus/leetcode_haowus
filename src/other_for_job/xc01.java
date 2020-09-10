package other_for_job;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 敏感词替换
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/9/8 19:38
 */
public class xc01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sense = sc.nextLine();
        String exam = sc.nextLine();//i love you,oyu love me
        String[] str = exam.split("[^a-zA-Z]");
        String instead = sc.nextLine();
        List<Object> list = new ArrayList<>();
        for (int i=0;i<exam.length();i++){
            char c = exam.charAt(i);
            if (!((c>='A'&&c<='Z')||(c>='a'&&c<='z')))
                list.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i< str.length;i++){
            if (similar(sense,str[i]))
                sb.append(instead);
            else
                sb.append(str[i]);
            if (i<str.length-1)
                sb.append(list.get(i));
        }
        System.out.println(sb.toString());

    }
    private static boolean similar(String sense,String s){

        if (sense.length()!=s.length())
            return false;
        char[] sensech = sense.toCharArray();
        char[] sch = s.toCharArray();
        Arrays.sort(sensech);
        Arrays.sort(sch);
        for (int i=0;i< sch.length;i++)
            if (sensech[i]!=sch[i])
                return false;
        return true;
    }
}
