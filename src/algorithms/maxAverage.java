package algorithms;

public class maxAverage {
    public double findMaxAverage(int[] nums, int k) {

        int max = Integer.MIN_VALUE;
        int i=0;
        while (i<nums.length-k+1){
            int countMax=0;
            for (int count=0;count<k;count++)
                countMax += nums[i+count];

            if (max<countMax)
                max = countMax;

            i++;
        }
        return (double) max/k;
    }
}
