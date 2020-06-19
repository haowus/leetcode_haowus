package leetcode_sf_offer;

/**
 * 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/19 21:49
 */
public class IQ_21 {
    public int[] exchange(int[] nums) {

        int l=0,r=nums.length-1;
        while (l<r){
            if (nums[l]%2==0 && nums[r]%2!=0){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
            else if (nums[l]%2!=0)
                l++;
            else if (nums[r]%2==0)
                r--;
        }
        return nums;
    }
}
