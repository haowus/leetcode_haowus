package leetcode_sf_offer;

/**
 * 剑指 Offer 29. 顺时针打印矩阵
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/20 16:06
 */
public class IQ_29 {

    public int[] spiralOrder(int[][] matrix) {

        if (matrix.length==0) return new int[0];
        int l=0,r =matrix[0].length-1;         //列数
        int t =0,b = matrix.length-1,x=0;       //行数
        int [] res = new int[(r+1)*(b+1)];
        while (true){
            for (int i=l;i<=r;i++)   //左到右
                res[x++] =matrix[t][i];
            if (++t > b)   //该判断执行后 t->t+1
                break;

            for (int i=t;i<=b;i++)   //上到下
                res[x++]=matrix[i][r];
            if (l>--r)
                break;

            for (int i=r;i>=l;i--)    //右到左
                res[x++] = matrix[b][i];
            if (t>--b)
                break;

            for (int i=b;i>=t;i--)    //下到上
                res[x++] = matrix[i][l];
            if (++l > r)
                break;
        }
        return res;

    }

}
