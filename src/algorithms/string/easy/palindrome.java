package algorithms.string.easy;

public class palindrome {
    public boolean validPalindrome(String s) {

        for (int i=0,j=s.length()-1;i<j;i++,j--){
            if (s.charAt(i)!=s.charAt(j))
                return ispalindrome(s,i+1,j)||ispalindrome(s,i,j-1);
        }
        return true;
    }

    public boolean ispalindrome(String s,int i,int j){
        while (i<j){
            if (s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
