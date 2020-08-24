package other_for_job.Three60;

import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/22 20:02
 */
public class txz01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int res =0;
        sc.nextLine();
        for (int i=0;i<n;i++){
            String s = sc.nextLine();
            if (s.length()<=10){
                int index=0;
                boolean flag = true;
                while (index<s.length()){
                    char c = s.charAt(index);
                    if (!isTrue(c)){
                        flag=false;
                        break;
                    }

                    index++;
                }
                if (flag) res++;
            }
        }
        System.out.println(res);
    }
    private static boolean isTrue(char c){
        if ((c<='z'&&c>='a')||(c>='A' && c<='Z'))
            return true;
        else
            return false;
    }
}
