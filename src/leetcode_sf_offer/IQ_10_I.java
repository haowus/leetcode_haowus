package leetcode_sf_offer;

/**
 * 面试题10- I. 斐波那契数列
 * @author haowus919@gmail.com in dormitory
 * @date 2020/6/18 22:14
 * 动态规划  用循环 算出dp数组中的值
 * 递归   调用自己
 */
public class IQ_10_I {
    public int fib(int n) {
        if (n<2) return n;
        int[] dp = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i=2;i<=n;i++)
            dp[i] = dp[i-1]%1000000007+dp[i-2]%1000000007;

        return dp[n]%1000000007;
    }
}
