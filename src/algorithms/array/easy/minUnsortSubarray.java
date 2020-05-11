package algorithms.array.easy;

import java.util.ArrayList;
import java.util.List;

public class minUnsortSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        if(len<=1) return 0;
        int max =nums[0],min=nums[len-1];
        int high=0,low=len-1;
        for (int i=1;i<len;i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[len-1-i]);

            if (nums[i]<max)
                high = i;
            if (nums[len-i-1]>min)
                low = len-i-1;
        }
        return high > low ? high-low+1 : 0;
    }

}
