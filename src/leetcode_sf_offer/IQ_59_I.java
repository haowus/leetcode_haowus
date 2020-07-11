package leetcode_sf_offer;

import java.util.*;

/**
 * 剑指 Offer 59 - I. 滑动窗口的最大值
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/7/11 19:29
 */
public class IQ_59_I {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        int l=0,r=k;
        while (r<nums.length){
            int max = nums[l];
            for (int i=l+1;i<r;i++)
                max = Math.max(max,nums[l]);
            res.add(max);
            l++;
            r++;
        }
        int[] out = new int[res.size()];
        for (int i=0;i<res.size();i++)
            out[i] = res.get(i);
        return out;
    }
}
