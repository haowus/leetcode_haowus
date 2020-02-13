package algorithms;

import java.util.HashSet;
import java.util.Set;

public class exchangeCandy {
    public int[] fairCandySwap(int[] A, int[] B) {

        int sumA = 0,sumB=0;
        for (int i:A)
            sumA+=i;
        for (int j:B)
            sumB+=j;
        int dis = (sumA-sumB)/2;
        Set setB= new HashSet();
        for (int x:B)
            setB.add(x);
        for (int x:A)
            if (setB.contains(x+dis))
                return new int[]{x,x+dis};
        return null;

    }
}
