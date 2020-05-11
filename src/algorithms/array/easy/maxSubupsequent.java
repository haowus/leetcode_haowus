package algorithms.array.easy;

public class maxSubupsequent {
    public int findLengthOfLCIS(int[] nums) {

        int max=nums[0],count=1,maxCount=0;
        for (int i=1;i<nums.length;i++){
            if (nums[i]>max){
                max = nums[i];
                count++;
                if (count>maxCount)
                    maxCount=count;
            }
            else{
                max=nums[i];
                count=1;
            }
        }
        return maxCount;
    }
}
