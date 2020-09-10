package other_for_job;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/9/6 11:36
 */
public class meituan02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++)
                nums[i] = sc.nextInt();
            if (nums.length < 3){
                if (nums[0]==1 && nums[1] ==1)
                {
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }

            }else{
                Arrays.sort(nums);
                int max = 1;
                for (int i =2; i<nums.length;i++){
                    if (nums[i]> max){
                        if (nums[i]!=nums[i-1] + nums[i-2] +1)
                            System.out.println("NO");
                        max = Math.max(max, nums[i]);
                    }
                }
                System.out.println("YES");
            }
        }


}}
