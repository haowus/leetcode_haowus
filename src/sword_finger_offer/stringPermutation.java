package sword_finger_offer;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class stringPermutation {

    private TreeSet<String> res;

    public ArrayList<String> Permutation(String str) {

        if (str==null||str.length()<1) return new ArrayList<>();
        List<Character> chars = new ArrayList<>();
        res = new TreeSet<>();
        for (char ch:str.toCharArray())
            chars.add(ch);
        compose(chars,new StringBuffer(),str.length(),0);
        return new ArrayList<>(res);

    }
    private void compose(List<Character> arr,StringBuffer buffer,int len,int index){
        //递归结束条件
        if (index == len){
            res.add(buffer.toString());
            return;
        }

        for (int i=0;i<arr.size();i++){
            char c = arr.get(i);
            buffer.append(c);
            arr.remove(i);
            compose(arr,buffer,len,index+1);
            arr.add(i,c);
            buffer.deleteCharAt(buffer.length()-1);
        }
    }

}


