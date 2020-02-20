package algorithms.string.easy;

public class longPress {
    public boolean isLongPressedName(String name, String typed) {
//双指针
        int i=0,j=0;
        while (i<name.length()&&j<typed.length()){
            if (name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }
            else if (j>0&&typed.charAt(j)==typed.charAt(j-1))
                j++;
            else
                return false;
        }
        return i==name.length();
    }
}
