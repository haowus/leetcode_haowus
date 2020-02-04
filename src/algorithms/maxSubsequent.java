package algorithms;

public class maxSubsequent {
    public static int maxSubArray(int[] nums) {

        int max = nums[0];
        for (int i=0;i<nums.length;i++){
            int sum = 0;
            for (int j=i;j<nums.length;j++){
                sum += nums[j];
                if (max<sum)
                    max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int out = maxSubArray(nums);
        System.out.println(out);
    }


}
