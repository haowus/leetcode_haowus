package algorithms.string.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class morseOnly {
    public int uniqueMorseRepresentations(String[] words) {

        String[] morse =new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<Character,String> map = new HashMap<>();
        for (int i=97;i<=122;i++){
            char sa = (char)(i);
            map.put(sa,morse[i-97]);
        }
        Set<String> set = new HashSet<>();
        for (int i=0;i<words.length;i++){
            char[] ch = words[i].toCharArray();
            String res = "";
            for (int j=0;j<ch.length;j++)
                res += map.get(ch[j]);

            set.add(res);
        }
        return set.size();


    }
}
