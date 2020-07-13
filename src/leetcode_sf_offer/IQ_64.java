package leetcode_sf_offer;

/**
 * 剑指 Offer 64. 求1+2+…+n
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/13 22:21
 */
public class IQ_64 {
    public int sumNums(int n) {
        if (n==0) return 0;
        return n + sumNums(n-1);
    }
}
