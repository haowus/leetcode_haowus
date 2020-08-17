package other_for_job.qianxin;

/**
 * 老板发奖金
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/16 15:45
 */
public class qax01 {

    /**
     *
     * @param num_money int整型 奖金的总数,单位为元
     * @return int整型
     */
    public static int CalulateMethodCount (int num_money) {
        // write code here
        if (num_money==1 || num_money==2) return num_money;
        if (num_money==3) return 4;
        int[] dp = new int[num_money+1];
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;

        for (int i=4;i<=num_money;i++){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[num_money];
    }
    public static void main(String[] args) {
        System.out.println(CalulateMethodCount(4));
    }
}
