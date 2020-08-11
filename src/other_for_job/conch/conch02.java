package other_for_job.conch;

import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/11 19:43
 */
public class conch02 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            if (n==1) System.out.println(getMin(m));
            else if (m==1) System.out.println(getMin(n));
            else System.out.println(Math.min(getMin(m),getMin(n)));

        }

    }
    private static int getMin(int num){
        for (int i=2;i<Math.sqrt(num)+1;i++)
            if (num%i==0)
                return i;
        return num;
    }
}
