package other_for_job.DJ;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/10 20:50
 */
public class dj01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            ArrayList<Integer> listTime = new ArrayList<>();
            int N = sc.nextInt();
            int A = sc.nextInt();
            int X = sc.nextInt();
            int n = N;
            int sum = 0;
            while (n > 0) {
                int a = sc.nextInt();
                listTime.add(a);
                sum += a;
                n--;
            }
            int coffNum = Math.min(X, 8);
            int timeMax = coffNum * 60;
            int T = 0;
            if (sum / A < timeMax) {
                double t = (double) sum / A;
                T = (int) Math.ceil(t);
            } else {
                double t = (double) sum - timeMax * A + timeMax;
                T = (int) Math.ceil(t);
            }
            if (T <= 480)
                System.out.println(T);
            else
                System.out.println(0);
        }
    }
}
