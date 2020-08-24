package other_for_job.bytedance;

import java.util.LinkedList;
import java.util.Scanner;

public class cs01 {
    static LinkedList<LinkedList<Integer>> res = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l=sc.nextInt();
        int r = sc.nextInt();
        LinkedList<Integer> track = new LinkedList<>();
        int[] nums = new int[r-l+1];
        for (int i=l;i<=r;i++){
            nums[i-l]=i;
        }
        backtrack(nums,track,n);
        System.out.println(res.size()%1000000007);
    }
    private static void backtrack(int[] nums, LinkedList<Integer> track,int n){
        if (track.size()== n){
            if (isThree(track))
                res.add(new LinkedList<>(track));
            return;
        }
        for (int i=0;i< nums.length;i++){
            track.add(nums[i]);
            backtrack(nums,track,n);
            track.removeLast();
        }
    }
    private static boolean isThree(LinkedList<Integer> track){
        int sum=0;
        for (int i=0;i<track.size();i++)
            sum+=track.get(i);
        if (sum%3==0) return true;
        else return false;
    }
}
