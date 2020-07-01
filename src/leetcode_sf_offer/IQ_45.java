package leetcode_sf_offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 45. 把数组排成最小的数
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/1 20:33
 */
public class IQ_45 {
    public String minNumber(int[] nums) {

        List<String> list = new ArrayList<>();
        for (int i:nums)
            list.add(String.valueOf(i));
        list.sort((o1, o2) -> (o1+o2).compareTo(o2+o1));//内部实现排序
        return String.join("",list);
    }

    public static void main(String[] args) {
        IQ_45 iq_45 = new IQ_45();
        iq_45.minNumber(new int[]{3,30,34,5,9});
    }
}
