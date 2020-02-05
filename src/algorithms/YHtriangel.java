package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class YHtriangel {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        for (int i=0;i<numRows;i++){
            List<Integer> sub = new ArrayList<>();
            for (int j=0;j<i+1;j++){
                if(j==0||j==i)
                    sub.add(1);
                else {
                    sub.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                }
            }
            result.add(sub);
        }
        return result;
    }
}
