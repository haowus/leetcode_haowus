package leetcode_sf_offer;

/**
 * 剑指 Offer 14- II. 剪绳子 II
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/19 19:34
 * 背掉吧
 */
public class IQ_14_II {
    public int cuttingRope(int n) {

        if (n==2) return 1;
        if (n==3) return 2;
        long res = 1;
        while (n>4){
            res *= 3;
            res = res % 1000000007;
            n -=3;
        }
        return (int) (res * n % 1000000007);
    }
}
