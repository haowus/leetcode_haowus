package other_for_job.meituan;

import java.util.Scanner;

/**
 * 无路可逃  没做出来
 * @Author haowus919@gmail.com in lab
 * @Date 2020/8/29 16:22
 * 5 1 2
 * 2 1
 * 3 1
 * 4 2
 * 5 3
 */
public class mt082902 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),x=sc.nextInt()-1,y=sc.nextInt()-1;
        int[][] matrix = new int[n][n];
        for (int i=0;i<n-1;i++){
            int u = sc.nextInt()-1;
            int v = sc.nextInt()-1;
            matrix[u][v] = 1;
            matrix[v][u] = 1;
        }
        dijstra(matrix,x,y);

    }
    private static void dijstra(int[][] matrix,int x,int y){
        int res = 0;
        for (int i=y;i< matrix.length;i++){
            int count=0;
            int index = -1;
            for (int j=0;j< matrix.length;j++){
                if (x!=j&&matrix[y][j]==1){
                    count++;
                    index=j;
                }
            }
            for (int m=0;m< matrix.length;m++){
                if (matrix[y][index]==1&&matrix[index][m]==1&&m!=x){
                    count++;
                }else if (m==x)
                    break;
            }
            res = Math.max(res,count);
        }
        System.out.println(res);
    }
}
