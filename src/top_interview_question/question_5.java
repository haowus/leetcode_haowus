package top_interview_question;

import java.util.ArrayList;
import java.util.Comparator;
class question_5 {
    public String longestPalindrome(String s) {
//超时 timeout
//        if( s.length()==0) return "";
//        if(s.length()==1) return s;
//        int right=-1;
//        int count=0;
//        ArrayList<String> res = new ArrayList<>();
//        for (int i=0;i<s.length();++i){
//            StringBuffer sb = new StringBuffer();
//            while (right+1<s.length()){
//                sb.append(s.charAt(right+1));
//                right++;
//                if (sb.length()>1 && isHUI(sb.toString()) && sb.length()>count){
//                    res.add(sb.toString());
//                    count = sb.length();
//                }
//            }
//            right = i;
//        }
//        if(res.size()==0) return String.valueOf(s.charAt(0));
//        res.sort(Comparator.comparingInt(String::length));
//        return res.get(res.size()-1);

        //中心扩散法
        if(s ==null ||s.length()==0) return "";
        int start=0,end=0;
        for (int i=0;i<s.length();i++){
            int oneCen = expand(s,i,i);   //奇数长度，一个中心
            int twoCen = expand(s,i,i+1);   //偶数长度，两个中心
            int max = Math.max(oneCen,twoCen);

            if (max > end-start){
                start = i - (max-1)/2;
                end = i+max/2;
            }
        }
        return s.substring(start,end+1);
    }

    static int expand(String s,int left,int right){

        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
    static boolean isHUI(String s){
        int i=0;
        int j=s.length()-1;
        while (i<j)
            if (s.charAt(i++)!=s.charAt(j--))
                return false;

        return true;
    }
}