package other_for_job.meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/15 16:06
 */
public class mt01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> res = new ArrayList<>();
        for (int i=1;i<=n;i++){
            if (isInverse(i,4*i))
                res.add(i);
        }
        System.out.println(res.size());
        for (int i=0;i< res.size();i++)
            System.out.println(res.get(i)+" "+(4*res.get(i)));
    }
    private static boolean isInverse(int num1,int num2){
        String str_one = String.valueOf(num1);
        String str_two = String.valueOf(num2);
        if (str_one.length()!=str_two.length()) return false;
        int fst = 0,lst=str_one.length()-1;
        while (fst<str_one.length() && lst>=0){
            if (str_one.charAt(fst)!=str_two.charAt(lst)){
                return false;
            }
            fst++;
            lst--;
        }
        return true;
    }
}
