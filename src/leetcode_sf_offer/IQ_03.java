package leetcode_sf_offer;

/**
 * 面试题03. 数组中重复的数字
 * @author haowus919@gmail.com in dormitory
 * @date 2020/6/16 22:34
 */
public class IQ_03 {
    public int findRepeatNumber(int[] nums) {

        int[] res = new int[nums.length];
        for (int i: nums){        //用相同大小的数组存储原数组中的元素，
            res[i]++;             //当发现新数组里的值>1，return。 即找到
            if (res[i]>1)
                return i;
        }
        return -1;

    }
}
