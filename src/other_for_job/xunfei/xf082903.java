package other_for_job.xunfei;

import java.util.Scanner;
public class xf082903 {

    private static String removeChar(String s){
        int left=0,right=s.length()-1;
        StringBuilder sb =new StringBuilder();
        while (s.charAt(left)=='_'){
            left++;
        }
        while (s.charAt(right)=='_'){
            right--;
        }
        s = s.substring(left,right+1);  //删掉两边的"_"
        String[] str = s.split("_++");
        for (int i=0;i< str.length-1;i++)
            sb.append(str[i]).append("_");
        sb.append(str[str.length-1]);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeChar(s));
    }
}
