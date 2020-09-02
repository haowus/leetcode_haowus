package other_for_job.fiveeight;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/31 21:06
 */
public class fe02 {
    public int question (int a, int b) {
        // write code here
        for (int i=0;i<=500;i++){
            int m =i+a;
            int n=i+b;
            if (Math.sqrt(m)%1.0==0 && Math.sqrt(n)%1.0==0)
                return i;
        }
        return -1;
    }
}
