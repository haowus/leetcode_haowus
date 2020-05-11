package algorithms.string.easy;

import java.util.HashMap;
import java.util.Map;

public class firstUniqueNum {
    public int firstUniqChar(String s) {

        Map<Character,Integer> map = new HashMap<>();
        for (char ch:s.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);
        for (int i=0;i<s.toCharArray().length;i++)
            if (map.get(s.toCharArray()[i])==1)
                return i;
        return -1;
    }
}
