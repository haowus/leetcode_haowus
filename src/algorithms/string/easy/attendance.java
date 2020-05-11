package algorithms.string.easy;

public class attendance {
    public boolean checkRecord(String s) {

        int countA = 0,countL=0;
        char[] ch = s.toCharArray();
        for (int i=0;i<ch.length;i++){
            if (ch[i]=='A'){
                countA++;
                countL=0;
                if (countA>1) return false;
            }
            else if (ch[i]=='L'){
                countL++;
                if (countL>2)
                    return false;
            }

            else
                countL=0;
        }
        return true;
    }
}
