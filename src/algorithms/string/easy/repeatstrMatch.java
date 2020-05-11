package algorithms.string.easy;

public class repeatstrMatch {
    public int repeatedStringMatch(String A, String B) {

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == B.charAt(0)) {
                int k = i;
                int count = 1;//循环次数
                int j = 0;
                while (A.charAt(k) == B.charAt(j)) {
                    k++;
                    j++;
                    if (j >= B.length()) return count;   //B遍历完
                    if (k >= A.length()) {               //A遍历一次 count数+1
                        k = 0;
                        count++;
                    }
                }
            }
        }
        return -1;
    }
}
