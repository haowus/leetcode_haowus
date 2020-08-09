package other_for_job.NetEase;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/9 20:03
 */
public class ne02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[m];
        for (int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        int[] res;
        res = process(nums,n);
        for (int i:res)
            System.out.print(i+" ");
    }
    private static int[] process(int[] nums,int n){
        int[] res = new int[n];
        int m = nums.length;
        int[] temp = new int[n-m];
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int index = 1;
        for (int i=0;i<n-m;i++){
            while (set.contains(index))
                index++;
            temp[i] = index++;
        }
        //归并排序的思想
        int index_nums=0,index_temp=0;
        for (int i=0;i<n;i++){
            if (index_nums<m && index_temp<n-m){
                if (temp[index_temp]<=nums[index_nums]){
                    res[i] = temp[index_temp];
                    index_temp++;
                }else {
                    res[i] = nums[index_nums];
                    index_nums++;
                }
            }
            else if(index_nums<m){
                res[i] = nums[index_nums++];
            }else
                res[i] = temp[index_temp++];

        }
        return res;
    }
}
