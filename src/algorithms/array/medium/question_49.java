package algorithms.array.medium;

import java.util.*;

/**
 * 字母异位词分组
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/15 20:22
 */
public class question_49 {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();
        for (String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if (!map.containsKey(key))
                map.put(key,new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
