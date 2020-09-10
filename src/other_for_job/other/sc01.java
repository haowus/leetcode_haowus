package other_for_job.other;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/9/2 12:42
 */
public class sc01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2 = sc.nextLine();
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        List<Character> arr = new ArrayList<>();
        if (str1.length!=str2.length)
            System.out.println(false);
        int len = str1.length;
        int first=-1;
        int second = -1;
        boolean flag = true;
        for (int i=0;i<len;i++){
            if (str1[i]!=str2[i] && first==-1){
                first=i;
                continue;
            }
            if (str1[i]!=str2[i] && second==-1){
                second =i;
                continue;
            }
            if (str1[i]!=str2[i] && first==-1&& second==-1){
                System.out.println(false);
                flag=false;
                continue;
            }
        }
        if (flag){
            if (str1[first]==str2[second]&&str1[second]==str2[first])
                System.out.println(true);
            else
                System.out.println(false);
        }
    }
}
