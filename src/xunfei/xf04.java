package xunfei;

import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/7/31 14:07
 */
public class xf04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++){
            if (sb.length()<1 && (s.charAt(i)=='0'||s.charAt(i)=='.')) {
            }
            else if (s.charAt(i)<='9'&&s.charAt(i)>='0')
                sb.append(s.charAt(i));
            else if (s.charAt(i)=='.')
                break;
        }

        String out = sb.toString();

        if (out.length()==0){
            System.out.println("无数字");
        }else {
            int res = Integer.valueOf(out);
            System.out.println(res);
        }


//        if (out.length()==0)
//            System.out.println("无数字");
//        if (out.length()==1 && out.charAt(0)=='0')
//            out = "0";
//        if (out.length()>1 && out.charAt(0)=='0')
//            out = out.substring(1);


    }
}
