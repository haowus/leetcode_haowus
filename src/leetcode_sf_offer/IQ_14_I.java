package leetcode_sf_offer;

/**
 * 面试题14- I. 剪绳子
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/19 16:41
 */
public class IQ_14_I {
    public int cuttingRope(int n) {

        int[] dp = new int[n+7];
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 2;
        dp[4] = 4;
        dp[5] = 6;
        dp[6] = 9;

        if(n<=6) return dp[n];
        for (int i=7;i<=n;i++)
            dp[i] = dp[i-3]*3;

        return dp[n];
    }
}
