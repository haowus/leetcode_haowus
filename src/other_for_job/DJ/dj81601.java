package other_for_job.DJ;

import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/16 20:20
 */

public class dj81601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lubiao = sc.nextInt();
        int channel = sc.nextInt();

        int[][] vals = new int[lubiao][lubiao];
        for (int i=0;i<lubiao;i++)
            for (int j=0;j<lubiao;j++)
                if (i==j)
                    vals[i][j] = 0;
                else
                    vals[i][j] = Integer.MAX_VALUE;
        for (int i=0;i<channel;i++)
            vals[sc.nextInt()][sc.nextInt()] = sc.nextInt();
        int X = sc.nextInt();

        for (int i=1;i<=X;i++)
            vals[0][i] = Math.min((vals[0][i-1] + vals[i-1][i]),vals[0][i]);

        System.out.println(vals[0][X]);


    }
}
