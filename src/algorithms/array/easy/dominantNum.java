package algorithms.array.easy;

public class dominantNum {
    public int dominantIndex(int[] nums) {

        int max=0,index=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]>max){
                max=nums[i];
                index=i;
            }

        }
        int count=0;
        for (int j=0;j<nums.length;j++){
            if (max>=nums[j]*2&&j!=index)
                count++;
        }
        return count==nums.length-1?index:-1;
    }
}
