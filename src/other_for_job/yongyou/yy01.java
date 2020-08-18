package other_for_job.yongyou;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/18 15:27
 */
public class yy01 {
    public String compress (String str) {
        // write code her

        StringBuilder sb = new StringBuilder();

        if (str.length() < 2) return str;

        char flag = str.charAt(0);
        int pindex = 1;
        for (int i = 1; i < str.length(); i++) {
            if (flag == str.charAt(i))
                pindex++;
            else {
                sb.append(flag);
                sb.append(pindex);
                flag = str.charAt(i);
                pindex = 1;
            }
        }
        sb.append(flag);
        sb.append(pindex);
        if (sb.length() <= str.length())
            return sb.toString();
        else
            return str;
    }
}
