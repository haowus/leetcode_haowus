package algorithms;

import java.util.*;

public class third_Max {
    public static int thirdMax(int[] nums) {
        TreeSet<Integer> numSet = new TreeSet<>();
        for (int i = 0; i < nums.length; i++)
            numSet.add(nums[i]);
        if (numSet.size() < 3)
            return numSet.last();
        else {
            numSet.remove(numSet.last());
            numSet.remove(numSet.last());
            return numSet.last();
        }

    }

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{1,1,2}));
    }
}
