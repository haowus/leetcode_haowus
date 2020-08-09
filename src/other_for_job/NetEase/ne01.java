package other_for_job.NetEase;

import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/8 15:08
 */
public class ne01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        long res = 0;
        int[] nums = new int[number];
        for (int i=0;i<number;i++){
            nums[i]=sc.nextInt();
        }
        for (int i=0;i<nums.length;i++){

            if (nums[i]==0 ||nums[i]==1) {
            }
            else if (nums[i]==3)
                res++;
            else
                res += nums[i]/2;
        }
        System.out.println(res);
    }

}
