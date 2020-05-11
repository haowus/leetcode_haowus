package algorithms.array.easy;

import java.util.*;

public class du_array {
    public int findShortestSubArray(int[] nums) {

        Map<Integer, Integer> left = new HashMap(),
                right = new HashMap(), count = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (left.get(x) == null)
                left.put(x, i);    //left  数组中的数 不论出现几次只计1次，计首次出现时的数组下标
            right.put(x, i);      //right  数组中的数 出现几次计几次，会覆盖。计最后一次出现时的数组下标
            count.put(x, count.getOrDefault(x, 0) + 1);   //数组中的数 及其 出现的次数
        }

        int ans = nums.length;
        int degree = Collections.max(count.values());  //出现次数最大的那个数的次数
        for (int x: count.keySet()) {              //x: map中的key.
            if (count.get(x) == degree) {
                ans = Math.min(ans, right.get(x) - left.get(x) + 1);
            }
        }
        return ans;


    }
}
