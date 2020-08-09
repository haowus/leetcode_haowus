package other_for_job.xunfei;

import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/7 21:45
 */
public class wy20_03 {
    private static int count;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] nums = new int[number];
        for (int i=0;i<number;i++)
            nums[i] = sc.nextInt();
        sort(nums,0,nums.length-1);
        System.out.println(count);


    }
    private static void sort(int[] nums,int l,int r){
        if (l==r) return;
        int mid = l + (r-l)/2;
        sort(nums,l,mid);
        sort(nums,mid+1,r);
        MergeSort(nums,l,mid+1,r);
    }

    private static void MergeSort(int[] nums, int left, int rightSt, int right) {

        int mid = rightSt-1;
        int[] temp = new int[right-left+1];
        int k =0;
        int i = left,j=rightSt;
        while (i<=mid && j<=right){

            if (nums[i]<=nums[j]){
                temp[k] = nums[i];
                k++;
                i++;
            }else {
                int t = i;
                while (t<=mid){
                    count += (nums[t]-nums[j]);
                    t++;
                }
                temp[k] = nums[j];
                j++;
                k++;
            }
        }

        while (i<=mid) temp[k++] = nums[i++];
        while (j<=right) temp[k++] = nums[j++];
        for (int m=0;m<temp.length;m++){
            nums[m+left] = temp[m];
        }
    }

}
