package leetcode_sf_offer;

/**
 * 剑指 Offer 15. 二进制中1的个数
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/19 19:57
 */
public class IQ_15 {
    public int hammingWeight(int n) {

        int count = 0;
        while (n !=0){
            count += n&1;
            n = n>>>1;    //无符号右移
        }
        return count;

    }
}
