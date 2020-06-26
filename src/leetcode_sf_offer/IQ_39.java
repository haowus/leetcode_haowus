package leetcode_sf_offer;

import java.util.Arrays;

/**
 * 剑指 Offer 39. 数组中出现次数超过一半的数字
 * @author haowus919@gmail.com in dormitory
 * @date 2020/6/26 22:31
 */
public class IQ_39 {
    public int majorityElement(int[] nums) {

        int k = nums.length/2;
        Arrays.sort(nums);
        return nums[k];
    }
}
