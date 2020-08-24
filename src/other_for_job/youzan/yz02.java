package other_for_job.youzan;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/20 19:36
 */
public class yz02 {
    /**
     *
     * @param nums int整型一维数组
     * @return int整型
     */
    public static int maxSumDivFive (int[] nums) {
        // write code here
//[1,2,3,4,4]  [3,6,5,1,8]
//        int max = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int res = nums[i];
//            if (res % 5 == 0)
//                max = Math.max(res, max);
//            for (int j = i + 1; j < nums.length; j++) {
//                res += nums[j];
//
//                if (res % 5 == 0)
//                    max = Math.max(res, max);
//
//            }
//        }
//        return max;
        //动态规划
        int[] dp={0,-10000,-10000,-10000,-10000};
        for(int num:nums){
            int[] temp=new int[5];
            for(int j=0;j<3;j++){
                temp[(j+num)%5]=Math.max(dp[(j+num)%5],dp[j]+num);
            }
            for(int j=0;j<5;j++){
                dp[j]=temp[j];
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,6,5,1,8};
        System.out.println(maxSumDivFive(nums));

    }
}
