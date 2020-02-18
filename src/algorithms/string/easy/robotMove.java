package algorithms.string.easy;

import java.util.HashMap;
import java.util.Map;

public class robotMove {
    public boolean judgeCircle(String moves) {

        int x=0,y=0;
        char[] chars = moves.toCharArray();
        for (char ch:chars){
            if (ch=='D')
                y--;
            else if (ch=='U')
                y++;
            else if (ch=='R')
                x++;
            else
                x--;
        }
        return x==0&&y==0?true:false;
    }
}
