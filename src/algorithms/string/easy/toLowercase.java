package algorithms.string.easy;

public class toLowercase {
    public String toLowerCase(String str) {

        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i=0;i<chars.length;i++){
            if (chars[i]<='Z'&&chars[i]>='A')
                sb.append(chars[i]+32);
            else if (chars[i]<='z'&&chars[i]>='a')
                sb.append(chars[i]);
        }
        return sb.toString();
    }
}
