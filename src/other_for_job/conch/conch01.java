package other_for_job.conch;

import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/11 19:05
 */
public class conch01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        int count=0;
        int i=0,j=len-1;
        while (i<j){
            if (s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else {
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}
