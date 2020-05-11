package algorithms.string.easy;

public class gcdStr {
    public String gcdOfStrings(String str1, String str2) {
        if ((str1 + str2).equals((str2 + str1)))
            for (int i = str1.length(); i > 0; i--)
                if (str1.length() % i == 0 && str2.length() % i == 0
                        && (str1.substring(0, i) + str2).equals(str2 + str1.substring(0, i)))
                    return str1.substring(0, i);
        return "";
    }
}
