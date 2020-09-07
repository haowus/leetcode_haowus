package other_for_job.others;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author haowus919@gmail.com in lab
 * @Date 2020/9/4 20:06
 */
public class bililc03 {
    public static void main(String[] args) {
        String s = "\"\"";
        System.out.println(getAveLen("aaabbaaac"));

    }
    private static int getAveLen(String s){
        ArrayList<String> list = new ArrayList<>();
        Pattern p = Pattern.compile("([a-z])\\1*");
        Matcher m = p.matcher(s);
        while (m.find())
            list.add(m.group());
        int sunLen = 0;
        for (String str:list)
            sunLen+=str.length();
        return sunLen/list.size();
    }

}
