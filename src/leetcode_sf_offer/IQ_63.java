package leetcode_sf_offer;

/**
 * 剑指 Offer 63. 股票的最大利润
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/13 22:12
 */
public class IQ_63 {
    public int maxProfit(int[] prices) {
        if (prices==null || prices.length==0) return 0;
        int res = 0;
        int minBuy = prices[0];
        for (int i=1;i<prices.length;i++){
            if (prices[i]<minBuy)
                minBuy = prices[i];
            else {
                res = Math.max(prices[i]-minBuy,res);
            }
        }
        return res;
    }
}
