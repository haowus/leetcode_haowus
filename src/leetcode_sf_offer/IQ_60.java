package leetcode_sf_offer;

/**
 * 剑指 Offer 60. n个骰子的点数
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/7/11 21:12
 * 动态规划  好难啊
 */
public class IQ_60 {
    public double[] twoSum(int n) {
        int[][] dp = new int[n+1][6*n+1];  //i个骰子掷出s点数的次数
        for (int i=1;i<=6;i++)
            dp[1][i] = 1;   //1个骰子掷出i点数的次数为1

        for (int i=2;i<=n;i++)  //骰子个数
            for (int j=i;j<=6*n;j++)  //掷出的点数之和
                for (int k=1;k<=6;k++){   //一个骰子掷出的点数
                    if(j-k<i-1) {//当总数还没有k大时，就不存在这种情况
                        break;
                    }
                    dp[i][j] += dp[i-1][j-k];
                    //当前n个骰子出现的点数之和等于前一次出现的点数之和加上这一次出现的点数
                }
        double total = Math.pow(6,n);
        double[] ans = new double[5*n+1];
        for (int i=n;i<=6*n;i++)
            ans[i-n] = (double)dp[n][i] /total;
        return ans;
    }
}
