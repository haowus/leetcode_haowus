package other_for_job.meituan;

import java.util.Scanner;

public class mt04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        int[][] vals = new int[n][2];
        int[][] dp = new int[a + 1][b + 1];
        for(int i = 1; i <= n; i++){
            vals[i - 1][0] = sc.nextInt();
            vals[i - 1][1] = sc.nextInt();
            sc.nextLine();
            for(int j = Math.min(a, i); j >= 0; j--){
                for(int k = Math.min(b, i); k >= 0; k--){
                    if(j + k + (n - i + 1) < a + b){
                        break;
                    }
                    //dp[j][k] = dp[j][k];
                    if(j > 0)
                        dp[j][k] = Math.max(dp[j][k], dp[j - 1][k] + vals[i - 1][0]);
                    if(k > 0)
                        dp[j][k] = Math.max(dp[j][k], dp[j][k - 1] + vals[i - 1][1]);
                }
            }
        }
        System.out.println(dp[a][b]);

    }
}
