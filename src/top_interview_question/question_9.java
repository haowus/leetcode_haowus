package top_interview_question;

import java.util.ArrayList;
import java.util.List;

public class question_9 {
    public static boolean isPalindrome(int x){
        if (x<0) return false;
        if (x==0) return true;
//        List<Integer> list = new ArrayList<>();
//        while (x!=0){
//            list.add(x%10);
//            x = x/10;
//        }
//        int i=0,j=list.size()-1;
//        while (i<j){
//            if(!list.get(i++).equals(list.get(j--)))
//                return false;
//        }
//        return true;
        int y=x;
        int res =0,pop=1;
        while (x!=0){
            pop = x%10;
            x /= 10;
            res = res*10+pop;
        }

        return res==y;

    }

    public static void main(String[] args) {
        boolean t = isPalindrome(1221);
        System.out.println(t);
    }
}
