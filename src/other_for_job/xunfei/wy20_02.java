package other_for_job.xunfei;

import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/8 12:57
 */
public class wy20_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int batch = sc.nextInt();
        for (int i = 0;i<batch;i++){
            int[] nums = new int[4];
            for (int j=0;j<4;j++){
                nums[j] = sc.nextInt();
            }
            System.out.println(counting(nums));

        }
    }
    private static int counting(int[] nums){
        int a = nums[0];
        int b = nums[1];
        int p = nums[2];
        int q = nums[3];

        int count = 0;
        int diff = b-a;
        while (diff > p ){
            p = p*q;
            count++;
        }
        return count+1;
    }
}
