package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class findMissing {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        TreeSet<Integer> numSet = new TreeSet<>();
        for (int i:nums)
            numSet.add(i);
//        List<Integer> aa = new ArrayList<>(numSet);
        for (int j=1;j<=nums.length;j++){
            if (!numSet.contains(j))
                result.add(j);
        }
        return result;

}

}
