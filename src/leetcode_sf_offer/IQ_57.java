package leetcode_sf_offer;

/**
 * 剑指 Offer 57. 和为s的两个数字
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/7/9 20:26
 * 双指针
 */
public class IQ_57 {
    public int[] twoSum(int[] nums, int target) {

        int l = 0,r = nums.length-1;
        while (l<r){
            int sum = nums[l] + nums[r];
            if (sum==target)
                return new int[]{nums[l],nums[r]};
            else if (sum<target)
                l++;
            else
                r--;
        }
        return new int[2];
    }
}
