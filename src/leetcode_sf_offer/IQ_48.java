package leetcode_sf_offer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 剑指 Offer 48. 最长不含重复字符的子字符串
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/2 21:12
 */
public class IQ_48 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int res=0;
        int l = 0;
        for (int r=0;r<s.length();r++){
            if (map.containsKey(s.charAt(r)))
                l = Math.max(l, map.get(s.charAt(r)));  //调整左指针
            map.put(s.charAt(r),r);
            res = Math.max(res,r-l+1);
        }
        return res;
    }
}
