package other_for_job.meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/22 17:18
 */
public class mt082201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<String> res = new ArrayList<>();
        for (int i=0;i<n;i++){
            String s = sc.nextLine();
            res.add(isAC(s));
        }
        for (int i=0;i<res.size();i++)
            System.out.println(res.get(i));

    }
    private static String isAC(String s){
        String str = "^[A-Z a-z 0-9]+$";
        if (!Pattern.compile(str).matcher(s).find()){
            return "Wrong";
        }
        String reg = "^[A-Z a-z]+[1-9]+[a-z A-Z]*[1-9]*";
        Pattern pattern = Pattern.compile(reg);
        if (pattern.matcher(s).find())
            return "Accept";
        return "Wrong";
    }

//    Scanner sc = new Scanner(System.in);
//    int line = sc.nextInt();
//    List<String> arr = new ArrayList<>();
//        for (int i=0;i<line;i++)
//            arr.add(sc.nextLine());
//        for (int i=0;i< arr.size();i++){
//        int num=0;
//        int string =0;
//        boolean flag =true;
//        char[] chars = arr.get(i).toCharArray();
//        for (int j=0;j<chars.length;j++){
//            if (chars[0]>122 || chars[0]<65||(chars[0]>90 && chars[0]<97)){
//                System.out.println("Wrong");
//                flag = false;
//                break;
//            }else if (chars[j]>122 || (chars[j]<65&&chars[j]>57)||(chars[j]>90&&chars[j]<97)||chars[j]<48){
//                System.out.println("Wrong");
//                flag = false;
//                break;
//            }
//            if ((chars[j]>=65&&chars[j]<=90)||(chars[j]>=97&&chars[j]<=122))
//                string++;
//            if (chars[j]>=48&&chars[j]<=57)
//                num++;
//        }
//        if (flag){
//            if (string>0&&num>0)
//                System.out.println("Accept");
//            else
//                System.out.println("Wrong");
//        }
//    }
}
