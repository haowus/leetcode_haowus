package sword_finger_offer;

public class rol_n {
    public String LeftRotateString(String str,int n) {

        if (str.length()<1) return "";
        n = n%str.length();
        String temp = str.substring(0,n);
        str += temp;
        String s = str.substring(n);
        return s;

    }
}
