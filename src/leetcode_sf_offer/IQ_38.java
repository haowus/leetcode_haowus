package leetcode_sf_offer;

import java.util.HashSet;
import java.util.Set;

/**
 * 剑指 Offer 38. 字符串的全排列
 * @author haowus919@gmail.com in dormitory
 * @date 2020/6/26 21:09
 */

public class IQ_38 {
    Set<String> res = new HashSet<>();
    public String[] permutation(String s) {

        StringBuilder sb = new StringBuilder();
        boolean[] used = new boolean[s.length()];
        backtrack(s,sb,used);
        return res.toArray(new String[0]);
    }
    private void backtrack(String s,StringBuilder sb,boolean[] used){

        if (sb.length()==s.length()){
            res.add(sb.toString());
            return;
        }

        for (int i = 0; i<s.length(); i++){
            if (used[i]) continue;
            sb.append(s.charAt(i));
            used[i]=true;
            backtrack(s,sb,used);
            sb.deleteCharAt(sb.length()-1);
            used[i]=false;
        }
    }
}
