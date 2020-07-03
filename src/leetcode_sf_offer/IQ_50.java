package leetcode_sf_offer;

import sun.reflect.generics.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * 剑指 Offer 50. 第一个只出现一次的字符
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/3 20:54
 */
public class IQ_50 {
    public char firstUniqChar(String s) {

        int[] res = new int[26];

        for (int i=0;i<s.length();i++){
            res[s.charAt(i)-'a']++;
        }
        for (int i=0;i<s.length();i++)
            if (res[s.charAt(i)-'a']==1)
                return s.charAt(i);
        return ' ';
    }
}
