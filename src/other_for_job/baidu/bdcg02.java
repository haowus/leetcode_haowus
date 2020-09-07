package other_for_job.baidu;

import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in lab
 * @Date 2020/9/3 20:02
 */
public class bdcg02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++)
                matrix[i][j] = sc.nextInt();

    }

}
