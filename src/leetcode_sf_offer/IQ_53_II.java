package leetcode_sf_offer;

/**
 * 剑指 Offer 53 - II. 0～n-1中缺失的数字
 * @author haowus919@gmail.com in dormitory
 * @date 2020/7/6 21:52
 */
public class IQ_53_II {
    public int missingNumber(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        while (l<=r){
            int mid = l + (r-l)/2;
            if (nums[mid] == mid)
                l = mid+1;
            else
                r = mid-1;
        }
        return l;
    }
}
