package other_for_job;

import java.util.Scanner;

/**
 * 迪杰斯特拉算法，求最短路径
 * @Author haowus919@gmail.com in lab
 * @Date 2020/8/24 16:26
 */
public class commonAlgo {
    //不能设置为Integer.MAX_VALUE，否则两个Integer.MAX_VALUE相加会溢出导致出现负权
    public static int MaxValue = 100000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入顶点数和边数:");
        int vertex = sc.nextInt();//顶点数
        int edge = sc.nextInt(); //边数
        int[][] matrix = new int[vertex][vertex];//构造邻接矩阵
        // 初始化邻接矩阵
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                matrix[i][j] = MaxValue;
            }
        }
        //把输入值赋值给邻接矩阵
        for (int i = 0; i < edge; i++) {
//            System.out.println("请输入第" + (i + 1) + "条边与其权值:");
            int source = sc.nextInt();
            int target = sc.nextInt();
            int weight = sc.nextInt();
            matrix[source][target] = weight;
        }
        //以哪个点作为起始点  最短路径，源点
        int source = sc.nextInt();
        //调用dijstra算法计算最短路径
        dijstra(matrix, source);
    }

    private static void dijstra(int[][] matrix, int source) {
        //存放最短路径的长度
        int[] shortest = new int[matrix.length];
        //存放该点的最短路径是否求出
        int[] visited = new int[matrix.length];
        //存储输出路径
        String[] path = new String[matrix.length];

        //初始化输出路径
        for (int i = 0; i < matrix.length; i++) {
            path[i] = new String(source + "->" + i);
        }

        //初始化源节点
        shortest[source]=0;
        visited[source]=1;

        for (int i=1;i< matrix.length;i++){
            int min = Integer.MAX_VALUE;
            int index=-1;
            for (int j=0;j< matrix.length;j++){
                //已经求出最短路径的节点不需要加入计算并判断加入节点后是否存在更短路径
                if (visited[j]==0 && matrix[source][j]<min){//找出与source距离最近的节点
                    min= matrix[source][j];
                    index=j;
                }
            }
            //index:找到的最近节点
            //更新最短路径shortest[]
            shortest[index]=min;
            visited[index]=1;

            //更新源点经过index跳到其他节点的较短路径
            for (int m=0;m< matrix.length;m++){
                if (visited[m]==0&&matrix[source][index]+matrix[index][m]<matrix[source][m]){
                    matrix[source][m] = matrix[source][index]+matrix[index][m];
                    path[m] = path[index] + "->" + m;
                }
            }

        }
        //打印最短路径
        for (int i = 0; i < matrix.length; i++) {
            if (i != source) {
                if (shortest[i] == MaxValue) {
                    System.out.println(source + "到" + i + "不可达");
                } else {
                    System.out.println(source + "到" + i + "的最短路径为："+ path[i] + "，最短距离是：" + shortest[i]);
                }
            }
        }


    }
}
