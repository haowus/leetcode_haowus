package leetcode_sf_offer;

import java.util.Arrays;

/**
 * 剑指 Offer 61. 扑克牌中的顺子
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/13 21:14
 * 大小王可替代任意牌
 */
public class IQ_61 {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);  //将数组排序
        int kingNum = 0;
        int emptyNum = 0;
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==0)
                kingNum++;  //大小王的个数
            else {
                if (nums[i+1]==nums[i])
                    return false;
                else if (nums[i]+1 !=nums[i+1])
                    emptyNum+=nums[i+1]-nums[i]-1;  //空的个数
            }
        }

        return kingNum>=emptyNum; //若大小王的个数大于等于空的个数，则说明是顺序的

    }
}
