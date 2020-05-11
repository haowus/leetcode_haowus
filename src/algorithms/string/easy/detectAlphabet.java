package algorithms.string.easy;

public class detectAlphabet {
    public boolean detectCapitalUse(String word) {

        int count=0;
        char[] ch = word.toCharArray();
        for (int i=0;i<ch.length;i++){
            if (ch[i]>='a'&&ch[i]<='z')
                count++;
        }
        if (count==ch.length||count==0)
            return true;
        else if (count==ch.length-1&&ch[0]>='A'&&ch[0]<='Z')
            return true;
        else
            return false;

    }
}
