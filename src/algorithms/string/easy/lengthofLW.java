package algorithms.string.easy;

public class lengthofLW {
    public int lengthOfLastWord(String s) {

        String[] ans = s.split(" ");
        if (ans.length!=0)
            return ans[ans.length-1].length();
        else
            return 0;

    }
}
