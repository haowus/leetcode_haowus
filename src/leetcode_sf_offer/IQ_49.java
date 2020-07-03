package leetcode_sf_offer;

/**
 * 剑指 Offer 49. 丑数
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/3 19:57
 */
public class IQ_49 {
    public int nthUglyNumber(int n) {
        if (n == 0) return 0;
        int[] res = new int[n];
        res[0] = 1;
        int p2 = 0, p3 = 0, p5 = 0;
        for (int i = 1; i < n; i++) {
            res[i] = Math.min(Math.min(res[p2] * 2, res[p3] * 3), res[p5] * 5);
            if (res[i] == res[p2] * 2)
                p2++;
            if (res[i] == res[p3] * 3)
                p3++;
            if (res[i] == res[p5] * 5)
                p5++;
        }
        return res[n - 1];
    }

}
