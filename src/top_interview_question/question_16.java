package top_interview_question;

import java.util.ArrayList;
import java.util.List;

public class question_16 {
    public int threeSumClosest(int[] nums, int target) {

        List<List<Integer>> lists = new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int a=0,b=0,c=0;
        for (int i=0;i<nums.length;i++){
            int l=i+1,r=nums.length-1;

            while (l<r){
                int sum = Math.abs(nums[i]+nums[l]+nums[r] - target);
                if (sum<min){
                    min = sum;
                    a=nums[i];
                    b=nums[l];
                    c=nums[r];
                }
                if (nums[i]+nums[l]+nums[r]>target)
                    r--;
                else
                    l++;
            }
        }
        return a+b+c;
    }
}
