package other_for_job.fiveeight;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/31 21:13
 */
public class fe03 {
    public int translateNum (int num) {
        // write code here
        String s = String.valueOf(num);
        int len = s.length();
        if (len==1) return 1;
        int a=1,b=1,c=1;
        if (mix(s.charAt(0)-'0',s.charAt(1)-'0'))
            b=2;
        a=b;
        for (int i=2;i<len;i++){
            a=b;
            if (mix(s.charAt(i-1)-'0',s.charAt(i)-'0'))
                a+=c;
            c=b;
            b=a;
        }
        return a;
    }

    private boolean mix(int a, int b) {
        if (a>2) return false;
        if (a==2 && b>5) return false;
        if (a==0) return false;
        return true;
    }
}
