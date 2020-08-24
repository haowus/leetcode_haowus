package other_for_job.tencent;

//5 3 2
//1 2 1
//2 3 1
//3 4 1
//4 5
//1 2
//  out:2
import java.util.Scanner;
class Route{
    int x;
    int y;
    int dis;

    public Route(int x, int y, int dis) {
        this.x = x;
        this.y = y;
        this.dis = dis;
    }
}
public class tc05 {
    public static void main(String[] args) {
        int MaxValue = 100000;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k = sc.nextInt();
        Route[] routes = new Route[m+k];
        for (int i=0;i<m;i++)
            routes[i] = new Route(sc.nextInt(),sc.nextInt(),sc.nextInt());
        for (int i=m;i<m+k;i++)
            routes[i] = new Route(sc.nextInt(),sc.nextInt(),0);
        int[][] matrix = new int[n][n];//邻接矩阵
        for (int i=0;i<matrix.length;i++)
            for (int j=0;j<matrix[0].length;j++)
                    matrix[i][j] = MaxValue;  //其他为很大的值
        for (int i=0;i< routes.length;i++){//把输入的x,y,l放入对应的矩阵框里面
            if (i<m){
                //前m行 是双向的
                matrix[routes[i].x-1][routes[i].y-1] = routes[i].dis;
                matrix[routes[i].y-1][routes[i].x-1] = routes[i].dis;
            }else
                //第m行到m+k行是 单向的
                matrix[routes[i].x-1][routes[i].y-1] = routes[i].dis;
        }
        dijstra(matrix,0);
    }
    private static void dijstra(int[][] matrix,int source){
        int[] shortest = new int[matrix.length];
        int[] visited = new int[matrix.length];
        String[] path = new String[matrix.length];
        for (int i=0;i< matrix.length;i++)
            path[i] = new String(source+"->"+i);
        shortest[0]=0;
        visited[0]=1;
        for (int i=1;i< matrix.length;i++){
            int min = Integer.MAX_VALUE;
            int index = -1;
            for (int j=0;j< matrix.length;j++){
                if (visited[j]==0&&matrix[source][j]<min){
                    min=matrix[source][j];
                    index=j;
                }
            }
            shortest[index]=min;
            visited[index]=1;
            for (int m=0;m< matrix.length;m++){
                if (visited[m]==0&&matrix[source][index]+matrix[index][m]<matrix[source][m]){
                    matrix[source][m]=matrix[source][index]+matrix[index][m];
                    path[m] = path[index]+"->"+m;
                }

            }
        }
        for (int i=0;i< matrix.length;i++)
            System.out.println(path[i] +": "+shortest[i]);
//        System.out.println(shortest[matrix.length-1]);
    }
}
