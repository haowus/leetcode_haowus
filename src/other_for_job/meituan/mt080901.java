package other_for_job.meituan;

import java.util.Scanner;

/**
 * 小团的选调计划
 * @Author haowus919@gmail.com in lab
 * @Date 2020/8/29 16:06
 * 5
 * 1 5 3 4 2
 * 2 3 5 4 1
 * 5 4 1 2 3
 * 1 2 5 4 3
 * 1 4 5 2 3
 */
public class mt080901 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] res = new int[n]; //存放结果
        res[0] = matrix[0][0];
        for (int i=1;i<n;i++){
            for (int j=0;j<n;j++){
                if (isExit(res,matrix[i][j])){
                    res[i] = matrix[i][j];
                    break;
                }
            }
        }
        for (int i:res)
            System.out.print(i+" ");
    }
    private static boolean isExit(int[] res,int num){
        for (int i=0;i< res.length;i++)
            if (res[i]==num)
                return false;
        return true;
    }
}
