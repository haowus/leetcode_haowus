package other_for_job.shence;

import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in lab
 * @Date 2020/8/28 15:34
 */
public class lengthofLIS {
    public static void main(String[] args) {
//10 9 2 5 3 7 101 18
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        int[] nums = new int[str.length];
        for (int i=0;i<str.length;i++){
            nums[i] = Integer.parseInt(str[i]);
        }
        System.out.println(solu(nums));
    }
    private static int solu(int[] nums){
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int max_ans = 1;
        for (int i = 1; i < dp.length; i++) {
            int max_val = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    max_val = Math.max(max_val, dp[j]);
                }
            }
            dp[i] = max_val + 1;
            max_ans = Math.max(max_ans, dp[i]);
        }
        return max_ans;
    }
}
