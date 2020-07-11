package leetcode_sf_offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 57 - II. 和为s的连续正数序列
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/7/9 20:39
 * 滑动窗口
 */
public class IQ_57_II {
    public int[][] findContinuousSequence(int target) {
        List<int[]> res= new ArrayList<>();
        int l=1,r=1;
        int sum=0;
        while (l<=target/2){
            if (sum<target){
                sum+=r;
                r++;   //右边界向右移动
            }else if (sum>target){
                sum -= l;
                l++;   //左边界向右移动
            }else {
                int[] in = new int[r-l];
                for (int i=l;i<r;i++)
                    in[i-l] = i;
                res.add(in);
                sum -= l;
                l++;  //左边界向右移动
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
