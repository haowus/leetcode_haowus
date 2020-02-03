package algorithms;

public class searchIn {
    public static int searchInsert(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            if (nums[i]>=target)
                return i;
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,5};
        int target = 6;
        System.out.println(searchInsert(nums,target));
    }
}
