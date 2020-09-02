package other_for_job.wanmei;

import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/25 20:20
 */
public class wm02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int r=sc.nextInt();
            int num =0;
            if (r>0) num++;
            if (x-r<30) num++;
            if (x+r>60) num++;
            if (y-r<30) num++;
            if (y+r>60) num++;
            if (Math.sqrt((30-x)*(30-x)+(30-y)*(30-y))<r) num++;
            if (Math.sqrt((60-x)*(60-x)+(30-y)*(30-y))<r) num++;
            if (Math.sqrt((60-x)*(60-x)+(60-y)*(60-y))<r) num++;
            if (Math.sqrt((30-x)*(30-x)+(60-y)*(60-y))<r) num++;
            System.out.println(num);
        }
    }
}
