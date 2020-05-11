package algorithms.string.easy;

import java.util.ArrayList;
import java.util.List;

public class reverseOL {
    public String reverseOnlyLetters(String S) {

        String operate = S.replaceAll("[a-zA-Z]","A");
        char[] op = operate.toCharArray();
        char[] chars = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<>();
        for (char ch:chars){
            if ((ch<='z'&&ch>='a')||(ch<='Z'&&ch>='A'))
                list.add(ch);
        }
        if(list.size()==0) return S;
        int t=list.size()-1;
        for (int i=0;i<op.length;i++){
            if (op[i]=='A')
                op[i]=list.get(t--);
            sb.append(op[i]);
        }
        return sb.toString();
    }
}
