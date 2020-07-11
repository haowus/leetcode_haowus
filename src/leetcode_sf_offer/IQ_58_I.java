package leetcode_sf_offer;

import java.util.StringJoiner;

/**
 * 剑指 Offer 58 - I. 翻转单词顺序
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/7/11 18:46
 */
public class IQ_58_I {
    public String reverseWords(String s) {
        StringJoiner sj = new StringJoiner(" ");
        String[] ss = s.trim().split("\\s+");
        for (int i=ss.length-1;i>=0;i--){
            sj.add(ss[i]);
        }
        return sj.toString();
    }

    public static void main(String[] args) {
        IQ_58_I iq58I = new IQ_58_I();
        System.out.println(iq58I.reverseWords("i am a student"));
    }
}
