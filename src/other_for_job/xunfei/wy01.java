package other_for_job.xunfei;

import java.util.Scanner;

/**
 * 序列交换
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/7 15:41
 */
public class wy01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [] nums = new int[len];
        for (int i=0;i<len;i++){
            nums[i] = sc.nextInt();
        }
        int i=1,j=len;
        while (i>=1 && j<=len){
            int sum = nums[i]+nums[j];
            if (sum%2==1) //之和为奇数
                swap(i,j,nums);


        }

    }
    private static void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
