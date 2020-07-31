package TEST;

/**
 * 寻找输入字符串中的数字，并按升序排序
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/7/31 10:37
 */
public class xunfei20_01 {
    public static void main(String[] args) {
        String s = "爱讯飞789swr1wwen34ifly65tek";
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++)
            if (s.charAt(i)>='0' && s.charAt(i)<='9')
                sb.append(s.charAt(i));
    }
}
