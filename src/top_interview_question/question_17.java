package top_interview_question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class question_17 {
    List<String> res = new ArrayList<>();


    public List<String> letterCombinations(String digits) {
        if(digits==null || digits.length()==0) return res;
        HashMap<Character,char[]> map = new HashMap<>();
        map.put('2',new char[]{'a','b','c'});
        map.put('3',new char[]{'d','e','f'});
        map.put('4',new char[]{'g','h','i'});
        map.put('5',new char[]{'j','k','l'});
        map.put('6',new char[]{'m','n','o'});
        map.put('7',new char[]{'p','q','r','s'});
        map.put('8',new char[]{'t','u','v'});
        map.put('9',new char[]{'w','x','y','z'});

        //记录路径
        StringBuilder track = new StringBuilder();
        backtrack(digits, 0,track,map);
        return res;

    }
    void backtrack(String digits, int depth,StringBuilder track,HashMap<Character,char[]> map) {
        //触发结束条件
        if(depth==digits.length()){
            res.add(track.toString());
            return;
        }
        char[] temp = map.get(digits.charAt(depth));

        for(int i=0;i<temp.length;i++){
            track.append(temp[i]);
            backtrack(digits,depth+1,track,map);
            track.deleteCharAt(track.length()-1);
        }
    }
}
