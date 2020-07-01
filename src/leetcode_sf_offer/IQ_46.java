package leetcode_sf_offer;

/**
 * 剑指 Offer 46. 把数字翻译成字符串
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/1 21:07
 */
public class IQ_46 {
    public static int translateNum(int num) {

        String s = String.valueOf(num);
        int[] dp = new int[s.length()];
        dp[0]=1;
        dp[1]=1;

        for (int i=2;i<=s.length();i++){
            String tempStr = s.substring(i-2,i);
            //如果指定的数大于参数返回 1。
            //tempStr.compareTo("10");  tempStr:指定的数,  "10" : 参数
            if (tempStr.compareTo("10") >=0 && tempStr.compareTo("25") <= 0)
                dp[i] = dp[i-1]+dp[i-2];
            else
                dp[i] = dp[i-1];
        }

        return dp[dp.length-1];

    }

}
