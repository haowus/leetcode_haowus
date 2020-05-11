package algorithms.array.easy;

public class majorityEle {
    public static int majorityElement(int[] nums) {

        int result = nums[0],times=1;
        for (int i=1;i<nums.length;i++){
            if (nums[i]==result)
                times++;
            else if (times==0){
                result=nums[i];
                times=1;
            }
            else
                times--;
        }
        times=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==result)
                times++;
            if (times>nums.length/2)
                return result;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1,1,1,2,2};
        int out = majorityElement(nums);
        System.out.println(out);
    }
}
