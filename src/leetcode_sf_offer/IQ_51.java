package leetcode_sf_offer;

/**
 * 剑指 Offer 51. 数组中的逆序对
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/3 21:18
 */
public class IQ_51 {
    public int reversePairs(int[] nums) {
        int len = nums.length;
        if (len<2) return 0;
        int[] copy = new int[len];
        for (int i = 0; i < len; i++) {
            copy[i] = nums[i];
        }

        int[] temp = new int[len];
        return reversePairs(copy,0,len-1,temp);
    }

    /**
     * nums[left..right] 计算逆序对个数并且排序
     *
     * @param nums
     * @param left
     * @param right
     * @param temp
     * @return
     */
    private int reversePairs(int[] nums, int left, int right, int[] temp) {
        if (left==right) return 0;

        int mid = left + (right-left)/2;

        int leftPair = reversePairs(nums,left,mid,temp);
        int rightPair = reversePairs(nums,mid+1,right,temp);

        int crossPair = mergeAndCount(nums,left,mid,right,temp);
        return leftPair + rightPair +crossPair;
    }

    /**
     * nums[left..mid] 有序，nums[mid + 1..right] 有序
     *
     * @param nums
     * @param left
     * @param mid
     * @param right
     * @param temp
     * @return
     */
    private int mergeAndCount(int[] nums, int left, int mid, int right, int[] temp) {
        for (int i = left; i <= right; i++) {
            temp[i] = nums[i];
        }
        int i=left,j=mid+1;

        int count = 0;
        for (int k=left;k<=right;k++){
            if (i==mid+1){
                nums[k] = temp[j];
                j++;
            }else if (j==right+1){
                nums[k] = temp[i];
                i++;
            }else if (temp[i]<temp[j]){
                nums[k] = temp[i];
                i++;
            }else {
                nums[k] = temp[j];
                j++;
                count += (mid - i + 1);
            }
        }
        return count;
    }
}
