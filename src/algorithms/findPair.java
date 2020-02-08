package algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findPair {
    public int findPairs(int[] nums, int k) {

        



        int t=0;
        int fc =0;
//        List<Integer> a = new ArrayList<>();
        for (int i=0;i<nums.length;i++){
//            int fc = nums[i];
            for (int j=i+1;j<nums.length;j++){
                if (Math.abs(nums[j]-nums[i])==k && fc !=nums[j]+nums[i]){
                    fc = nums[j]+nums[i];
                    t++;
                }
            }
        }


        return t;
    }
}
