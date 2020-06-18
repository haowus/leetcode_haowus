package leetcode_sf_offer;

/**
 * 面试题10- II. 青蛙跳台阶问题
 * @author haowus919@gmail.com in dormitory
 * @date 2020/6/18 22:53
 */
public class IQ_10_II {
    public int numWays(int n) {

        if (n<2) return 1;
        int[] dp = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;


        for (int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
            dp[i] = dp[i] %1000000007;
        }


        return dp[n];
    }
}
