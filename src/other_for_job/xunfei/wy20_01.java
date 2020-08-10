package other_for_job.xunfei;

import java.util.Scanner;

/**
 * @Auathor haowus919@gmail.com in dormitory
 * @Date 2020/8/8 12:45
 */
public class wy20_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int batch = sc.nextInt();
        for (int i=0;i<batch;i++)

            System.out.println(minbit(sc.nextInt()));
    }
    private static String minbit(int n){
        int mod = n/9;
        int container = n%9;
        StringBuilder sb = new StringBuilder();
        if (container!=0)
            sb.append(container);
        while (mod>0){
            sb.append('9');
            mod--;
        }
        return sb.toString();

    }
}
