package algorithms.string.easy;

import java.util.Map;

public class reverseStr_2 {
    public String reverseStr(String s, int k) {

        char[] ch = s.toCharArray();

        for (int start=0;start<s.length();start+=2*k){
            int i = start;
            int j = Math.min(start+k-1,ch.length-1);
            while (i<j){
                char tmp = ch[i];
                ch[i++] = ch[j];
                ch[j--] = tmp;
            }
        }
        return new String(ch);
    }
}
