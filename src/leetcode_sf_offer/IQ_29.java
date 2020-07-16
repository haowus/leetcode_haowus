package leetcode_sf_offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 29. 顺时针打印矩阵
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/20 16:06
 */
public class IQ_29 {

    List<Integer> list = new ArrayList<>();
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0) return new int[0];
        int rows = matrix.length,cols=matrix[0].length;
        int start=0;
        while (rows>2*start && cols>2*start){
            PrintMatrixCircle(rows,cols,start,matrix);
            start++;
        }
        int [] res = new int[rows*cols];
        for (int i=0;i<res.length;i++)
            res[i] = list.get(i);
        return res;


    }
    private void PrintMatrixCircle(int rows,int cols,int start,int[][] matrix){

        int endX = cols-start-1;  //终止列号
        int endY = rows-start-1;  //终止行号

        //从左到右打印一行
        for (int i=start;i<=endX;i++){
            int number = matrix[start][i];
            list.add(number);
        }
        //从上到下打印一列
        if (endY>start){ //终止行号>起始行号
            for (int i=start+1;i<=endY;i++){
                int number = matrix[i][endX];
                list.add(number);
            }
        }
        //从左到右打印一行
        if (endY>start &&endX>start){ //终止行号>起始行号 终止列号>起始列号
            for (int i=endX-1;i>=start;i--)
                list.add(matrix[endY][i]);
        }
        //从下到上打印一列
        if (endX>start && endY-1>start){//终止列号>起始列号 终止行号比起始行号大2
            for (int i=endY-1;i>=start+1;i--)
                list.add(matrix[i][start]);
        }
    }

}
