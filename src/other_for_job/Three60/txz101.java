package other_for_job.Three60;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/24 11:04
 */
public class txz101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String s1 = s.substring(0,1).toUpperCase();
        String s2 = s.substring(1);
        s = s1+s2;
        s = s.replace('n','N');
        List<Integer> index = new ArrayList<>();
        index.add(0);
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='N' && i!=0)
                index.add(i);
        }
        index.add(s.length());
        for (int i=0;i<index.size()-1;i++)
            System.out.println(s.substring(index.get(i),index.get(i+1)));


    }
}
