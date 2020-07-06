package leetcode_sf_offer;

/**
 * 剑指 Offer 53 - I. 在排序数组中查找数字 I
 * @author haowus919@gmail.com in dormitory
 * @date 2020/7/4 21:43
 */
public class IQ_53_I {
    public int search(int[] nums, int target) {

        //binarysearch
        int res = 0;
        int left =0;
        int right = nums.length-1;
        while (left<right){
            int mid = left+(right-left)/2;
            if (target <= nums[mid]){
                right = mid;
            }else if (target>nums[mid])
                left = mid+1;
        }
        //需保证nums[left]是第一个等于target的
        while (left<nums.length && nums[left++]==target)
            res++;
        return res;

    }
}
