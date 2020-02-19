package algorithms.string.easy;

import java.util.Map;

public class binarySubstr {
    public int countBinarySubstrings(String s) {

        int[] group = new int[s.length()];
        group[0]=1;
        int t = 0;
        int ans = 0;
        char[] chars = s.toCharArray();
        for (int i=1;i<chars.length;i++){
            if (chars[i-1]==chars[i])
                group[t]++;
            else {
                group[++t]=1;
            }
        }
        for (int i=1;i<t;i++)
            ans += Math.min(group[i-1],group[i]);
        return ans;
    }
}
