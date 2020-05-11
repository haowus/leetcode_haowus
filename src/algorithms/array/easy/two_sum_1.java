package algorithms.array.easy;

public class two_sum_1 {

    public static void main(String[] args) {
        int [] m = new int[]{1,2,3};
        System.out.println(m[0]+" "+m[1]);
        System.out.println(twoSum( new int[]{2,7,11,15},9)[1]);

    }
    public static int[] twoSum(int[] nums, int target) {

        for (int i=0; i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target)
                    return new int[] { i, j };
            }
        }

        return null;
    }


}
