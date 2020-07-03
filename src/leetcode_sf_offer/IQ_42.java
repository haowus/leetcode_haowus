package leetcode_sf_offer;

/**
 * 剑指 Offer 42. 连续子数组的最大和
 * @author haowus919@gmail.com in dormitory
 * @date 2020/6/28 23:46
 */
public class IQ_42 {
    // nums = [-2,1,-3,4,-1,2,1,-5,4]
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for (int i=1;i<nums.length;i++){
            nums[i] = nums[i]+Math.max(nums[i-1],0); //nums[i]：以该点为结尾，最大的子序和
            res = Math.max(res,nums[i]);    //找到最大的nums[i]
        }
        return res;
    }
}
