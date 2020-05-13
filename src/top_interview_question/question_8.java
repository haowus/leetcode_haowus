package top_interview_question;

public class question_8 {
    public static int myAtoi(String str){
        StringBuilder sb = new StringBuilder();
        str = str.trim();
        if (str.length()==0) return 0;
        if (!Character.isDigit(str.charAt(0)) && str.charAt(0) != '-' && str.charAt(0) != '+') return 0;


        int ans=0;
        boolean neg = false;
        if (str.charAt(0)=='+')
            neg = false;
        else if (str.charAt(0) == '-') {
            neg = true;
        }

        int i=(str.charAt(0)=='+'||str.charAt(0)=='-')?1:0;
        while (i<str.length() && Character.isDigit(str.charAt(i))){
            int digit = str.charAt(i)-'0';
            if (ans > (Integer.MAX_VALUE-digit)/10)
                return neg?Integer.MIN_VALUE : Integer.MAX_VALUE;
            ans = ans*10+digit;
            i++;
        }
        return neg?-ans:ans;
    }

    public static void main(String[] args) {
        myAtoi("-91283472332");
    }
}
