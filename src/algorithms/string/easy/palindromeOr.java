package algorithms.string.easy;

public class palindromeOr {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int start = 0,end = s.length()-1;
        int count = 0;
        while (start<end)
            if (s.charAt(start++)==s.charAt(end--))
                count++;
        if (count==s.length()/2)
            return true;
        else
            return false;
    }
}
