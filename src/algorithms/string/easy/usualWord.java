package algorithms.string.easy;

import java.util.HashMap;
import java.util.Map;

public class usualWord {
    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]"," ");//把所有非小写字母的字符替换成空格；
        String[] words = paragraph.split("\\s+");   // \\s+ 匹配多个空格
        Map<String,Integer> map = new HashMap<>();
        for (int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        for (int i=0;i<banned.length;i++){
            if (map.containsKey(banned[i]))
                map.remove(banned[i]);
        }
        int max = 0;
        String temp ="";
        int value=0;
        for(String key:map.keySet()){
            value = map.get(key);
            if(max<value){
                max = value;
                temp = key;
            }
        }
        return temp;

    }
}
