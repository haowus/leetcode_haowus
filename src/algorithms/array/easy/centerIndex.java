package algorithms.array.easy;

public class centerIndex {
    public int pivotIndex(int[] nums) {

//        int mid = nums.length/2;
//        int start=0,end=nums.length-1;
//        while ()
        int leftsum=0,sum=0,res=-1;
        for (int i=0;i<nums.length;i++){
            sum += nums[i];
        }

        for (int j=0;j<nums.length;j++){

            if (sum-nums[j]==leftsum*2)
                res = j;
            else
                leftsum+=nums[j];

        }

        return res;

    }
}
