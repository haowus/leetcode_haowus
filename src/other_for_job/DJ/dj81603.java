package other_for_job.DJ;

import java.util.Scanner;



public class dj81603 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();    //获取字符串
        String len = scanner.nextLine();     //获取删除的长度

        System.out.println(Solution.removeKdigits(num,len));
    }
}
class Solution {
    public static String removeKdigits(String num,String len) {
        int k = Integer.valueOf(len);
        if(num == null || ("").equals(num) || ("").equals(num.trim()) || k==0 ){
            return num;
        }

        if(num.length() <= k || num.length()>10002 ){
            return "0";
        }

        StringBuffer sb =  new StringBuffer(num);
        while(k>0) {
            int i=0;
            while(i<sb.length()-1 && sb.charAt(i)<=sb.charAt(i+1)) {
                i++;
            }
            sb.delete(i, i+1);
            k--;
        }

        //删掉前面有0的
        while(sb.length()!=0 && sb.charAt(0) == '0')
            sb.delete(0, 1);

        if(sb.length()==0)
            return "0";
        return sb.toString();
    }
}