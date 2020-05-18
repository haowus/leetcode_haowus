package top_interview_question;

import java.util.*;

public class question_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            //每次先固定一个值
            if (nums[i]>0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue; // 去重  发现有重复值，就去重，continue 后面的不执行
            int l=i+1,r=nums.length-1;
            while (l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if (sum==0){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while (l<r && nums[l]==nums[l+1]) l++;
                    while (l<r && nums[r]==nums[r-1]) r--;
                    l++;
                    r--;
                }
                else if (sum<0) l++;
                else r--;
            }

        }
        return res;
    }
}
