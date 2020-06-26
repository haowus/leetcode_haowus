package leetcode_sf_offer;

import java.util.Arrays;

/**
 * 剑指 Offer 40. 最小的k个数
 * @author haowus919@gmail.com in dormitory
 * @date 2020/6/26 22:37
 */
public class IQ_40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] res = new int[k];
        for (int i=0;i<k;i++)
            res[i] = arr[i];
        return res;
    }
}
