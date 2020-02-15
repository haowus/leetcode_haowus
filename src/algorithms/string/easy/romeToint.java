package algorithms.string.easy;

import java.util.HashMap;
import java.util.Map;
//首先建立一个HashMap来映射符号和值，然后对字符串从左到右来，
// 如果当前字符代表的值不小于其右边，就加上该值；
// 否则就减去该值。以此类推到最左边的数，最终得到的结果即是答案
public class romeToint {
    public int romanToInt(String s){
        int res = 0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (int i=0;i<s.length()-1;i++){
            if (map.get(s.charAt(i))>=map.get(s.charAt(i+1)))
                    res += map.get(s.charAt(i));
            else
                res -= map.get(s.charAt(i));
        }
        return res+map.get(s.charAt(s.length()-1));    //加上组后一个字母对应的数字
    }
}
