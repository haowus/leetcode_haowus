package leetcode_sf_offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 62. 圆圈中最后剩下的数字
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/13 21:45
 */
public class IQ_62 {
    public int lastRemaining(int n, int m) {

        List<Integer> res = new ArrayList<>();
        for (int i=0;i<n;i++)
            res.add(i);
        int index = 0;
        while (n>1){
            index = (index+m-1)%n;
            res.remove(index);
            n--;
        }
        return res.get(0);
    }
}
