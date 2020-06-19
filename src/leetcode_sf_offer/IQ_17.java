package leetcode_sf_offer;

/**
 * 剑指 Offer 17. 打印从1到最大的n位数
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/19 20:51
 */
public class IQ_17 {
    public int[] printNumbers(int n) {
        int res=0;
        for (int i=0;i<n;i++)
            res += 9 * Math.pow(10,i);
        int[] result = new int[res];
        for (int i=0;i<res;i++)
            result[i] = i+1;

        return result;
    }
}
