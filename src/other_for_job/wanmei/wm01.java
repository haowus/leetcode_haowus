package other_for_job.wanmei;

import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/25 20:16
 */
public class wm01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp = new int[n+1];
        dp[0]=1;
        for (int i=1;i<n+1;i++){
            dp[i] = 2* dp[i-1]+2;
        }
        System.out.println(dp[n]);
    }
}
