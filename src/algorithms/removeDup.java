package algorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class removeDup {
//双指针思想
    public static int removeDuplicates(int[] nums) {
         int cur = 0;
         int ahead =1;
         while (ahead<nums.length){
             if(nums[ahead] == nums[cur]){
                 ahead++;
             }
             else {
                 cur++;
                 nums[cur] = nums[ahead];
                 ahead++;
             }
         }
         return cur+1;
//        Set<Integer> newSet = new HashSet<>();
//        for(int i=0;i<nums.length;i++){
//            newSet.add(nums[i]);
//        }
//        System.out.println(newSet);
//        return newSet.size();

    }
    public static void main(String[] args) {

        int [] nums = new int[]{1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
