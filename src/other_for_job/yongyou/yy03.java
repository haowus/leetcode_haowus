package other_for_job.yongyou;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/18 15:34
 */
public class yy03 {
    /**
     * 现在给定所有的城市和航班，以及出发城市src，你的任务是找到从 scr城市出发到其他所有城市最便宜的机票价格列表。  假设两个城市之间机票价格不会超过Integer.MAX_V
     * @param n int整型
     * @param flights int整型二维数组
     * @param src int整型
     * @return int整型一维数组
     */
    public static int[] findAllCheapestPrice (int n, int[][] flights, int src) {
        // write code here
        int[][] cost = new int[n][n]; //构造邻接矩阵 cost[i][j] ：城市i到城市j的机票价格
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (i == j) cost[i][j] = 0; //赋初始值 自己到自己 0 自己到其他为-1
                else cost[i][j] = -1;

        for (int i = 0; i < flights.length; i++)
            cost[flights[i][0]][flights[i][1]] = flights[i][2]; //将具体价格赋值到cost矩阵

        for (int i = 1; i < n; i++){
            //计算以src为起点到各个城市的最少机票费用
            cost[src][i] = Math.min((cost[src][i - 1] + cost[i - 1][i]), cost[src][i]);
        }


        int[] res = new int[n];
        for (int i = 0; i < n; i++)
            if (cost[src][i]<-1)
                res[i] = 0;
            else
                res[i] = cost[src][i];
        return res;
    }

    public static void main(String[] args) {

//        yy03.findAllCheapestPrice(3,[[0,1,100],[1,2,100],[0,2,500]],0)
    }
}
