package other_for_job.xunfei;

import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/7 20:38
 */
public class wy20_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int batch = sc.nextInt();
        for (int i=0;i<batch;i++){
            int count = sc.nextInt();
            long[] nums = new long[count];
            for (int j=0;j<count;j++){
                nums[j] = sc.nextLong();
            }
            int res = perfectSeq(nums);
            System.out.println(res);
        }

    }

    private static int perfectSeq(long[] nums){
        int len = nums.length;
        int max = 0;
        int l=0,r=1;
        while (r<len){

            int sum = 0;
            for (int i=l;i<r;i++)
                sum+=nums[i];
            if (nums[r]>=sum)
                max = Math.max(r-l+1,max);
            else
                l=r;

            r++;
        }
        return max;
    }
}
