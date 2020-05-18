package TEST;

import java.util.HashMap;
import java.util.Map;

public class containsmaxsubarray {
    public static void main(String[] args) {
        String s = "fbxzvfaxbscfzcxsc";
        String t = "xsc";
        System.out.println(match(s,t));

    }
    static String match(String s,String t){
        int left=0,right=0;
        Map<Character,Integer> needs = new HashMap<>();
        Map<Character,Integer> windows = new HashMap<>();
        for (char c : t.toCharArray())
            needs.put(c,needs.getOrDefault(c, 0) + 1);
        int valid = 0;  //记录什么时候滑动窗口中的字符和需要的字符一样多
        int start =0,len = Integer.MAX_VALUE;  //记录匹配的最短字串的起始位置，长度.
        while(right<s.length()){

            char c = s.charAt(right);
            right++;
            if (needs.containsKey(c)){
                windows.put(c,windows.getOrDefault(c, 0) + 1);
                if (needs.get(c).equals(windows.get(c)))
                    valid++;
            }
            while(valid==needs.size()){
                if (right-left<len){
                    len = right-left;
                    start = left;
                }

                char d = s.charAt(left);
                left++;
                if (needs.containsKey(d)){
                    if (windows.get(d).equals(needs.get(d)))
                        valid--;
                    windows.put(d,windows.get(d)-1);
                }

            }
        }
        return len==Integer.MAX_VALUE?"":s.substring(start,start+len);
    }

}
