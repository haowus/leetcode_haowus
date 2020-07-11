package leetcode_sf_offer;

/**
 * 剑指 Offer 58 - II. 左旋转字符串
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/7/11 19:04
 */
public class IQ_58_II {
    public String reverseLeftWords(String s, int n) {
        String s1 = s.substring(0,n);
        String s2 = s.substring(n);
        return s2+s1;

    }
}
