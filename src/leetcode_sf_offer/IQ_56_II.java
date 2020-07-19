package leetcode_sf_offer;

/**
 * 剑指 Offer 56 - II. 数组中数字出现的次数 II
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/7/8 22:15
 * 难啊位运算  抄的
 */
public class IQ_56_II {
    public int singleNumber(int[] nums) {//本算法同样适用于数组nums中存在负数的情况
        int now = 1,ans =0;
        for (int i=0;i<32;i++){
            int count =0;
            for (int num:nums)  //对每一位 循环数组中的数,
                if ((num &now)!=0)
                    count++;
            if (count%3==1)
                ans |= now;    //若该位有三个数一样的，则说明该位为0
            now <<= 1;   //1-->2--->4    0001-->0010-->0100
        }
        
        return ans;
    }
}




