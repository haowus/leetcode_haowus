package algorithms.array.easy;


import java.util.Arrays;

public class missNumber {

    public int missingNumber(int[] nums) {

        Arrays.sort(nums);
        for (int i=0;i<=nums.length;i++){
            if (i!=nums[i])
                return i;
        }
        return nums.length;



    }
}
