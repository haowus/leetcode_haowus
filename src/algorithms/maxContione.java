package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class maxContione {
    public static int findMaxConsecutiveOnes(int[] nums) {

        int count = 0, max = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==1)
                count++;
            else {
                if(max<count)
                    max=count;
                count=0;
            }
        }
        if (max<count)
            max = count;
        return max;
    }

    public static void main(String[] args) {
        int[] nums= new int[]{1,0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
