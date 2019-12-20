package algorithms;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class subString_length_3 {
    public static int lengthOfLongestSubstring(String s){
        int curr = 0;
        int num = 1;
        LinkedList numlist = new LinkedList();
        LinkedList charlist = new LinkedList();
        while (curr<s.length()-1){
            char p = s.charAt(curr) , q=s.charAt(curr+1);
            charlist.add(p);
            if(!charlist.contains(q)){
                num++;
                curr++;
            }

            else{
                numlist.add(num);
                num=1;
                curr++;
            }

        }
        return (int) Collections.max(numlist);
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring(" "));
    }
}
