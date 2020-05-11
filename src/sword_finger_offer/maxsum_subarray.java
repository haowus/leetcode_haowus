package sword_finger_offer;

public class maxsum_subarray {
    public int FindGreatestSumOfSubArray(int[] array) {

        int res = Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++){
            int sum = 0;
            for (int j=i;j<array.length;j++){
                sum += array[j];
                if (sum>res)
                    res = sum;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new maxsum_subarray().FindGreatestSumOfSubArray(new int[]{-2,-8,-1,-5,-9}));
    }
}
