package other_for_job.huawei;

import java.util.Scanner;
/**
 * @Author haowus919@gmail.com in lab
 * @Date 2020/9/2 19:09
 */
public class hw090203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n =sc.nextInt();
        int[] weight = new int[n];
        int[] value = new int[n];
        for (int i=0;i<n;i++){
            weight[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            value[i]=sc.nextInt();
        }
        int[][] dp = new int[n + 1][k + 1];
        // 背包空的情况下，价值为 0
        dp[0][0] = 0;
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= k; ++j) {
                // 不选物品 i 的话，当前价值就是取到前一个物品的最大价值，也就是 dp[i - 1][j]
                dp[i][j] = dp[i - 1][j];
                // 如果选择物品 i 使得当前价值相对不选更大，那就选取 i，更新当前最大价值
                if ((j>=weight[i-1])&&(dp[i][j]< dp[i-1][j-weight[i-1]]+value[i-1])) {
                    dp[i][j] = dp[i - 1][j - weight[i - 1]] + value[i - 1];
                }
            }
        }
        // 返回，对于所有物品（0～N），背包容量为 V 时的最大价值
        System.out.println(dp[n][k]);
    }
}
