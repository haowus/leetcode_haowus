package other_for_job.baidu;

import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in lab
 * @Date 2020/9/3 20:27
 */
public class bdwz03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int nStair = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(Step(nStair,n));
    }
    private static long Step(int nStair,int n){
        if(nStair <= 0)
            return 0;
        else if(nStair == 1)
            return 1;
        else {
            long step = 0;
            long fstep = 1;
            for (int i = 2; i <= n; ++i) {
                step = 2 * fstep;
                fstep = step;
            }
            return step;
        }
    }
}
