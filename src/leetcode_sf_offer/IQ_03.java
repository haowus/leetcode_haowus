package leetcode_sf_offer;

/**
 * 面试题03. 数组中重复的数字
 * @author haowus919@gmail.com in dormitory
 * @date 2020/6/16 22:34
 */
public class IQ_03 {
    public int findRepeatNumber(int[] nums) {

//        int[] res = new int[nums.length];
//        for (int i: nums){        //用相同大小的数组存储原数组中的元素，
//            res[i]++;             //当发现新数组里的值>1，return。 即找到
//            if (res[i]>1)
//                return i;
//        }
//        return -1;
        int res = 0;
        for (int i=0;i<nums.length;i++){

            while (i!=nums[i]){
                if (nums[i]==nums[nums[i]]){
                    res = nums[i];
                    break;
                }
                swap(i,nums[i],nums);
            }
        }
        return res;
    }

    private void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        IQ_03 iq_03 = new IQ_03();
        System.out.println(iq_03.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));
    }
}
