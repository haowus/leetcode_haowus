package leetcode_sf_offer;

/**
 * 剑指 Offer 16. 数值的整数次方
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/19 20:25
 * 二分思想
 */
public class IQ_16 {

    public double myPow(double x, int n) {
        if (n==0) return 1;
        if (n==1) return x;
        if (n==-1) return 1/x;

        double half = myPow(x,n/2);
        double mod = myPow(x,n%2);
        return half*half*mod;
    }
}
