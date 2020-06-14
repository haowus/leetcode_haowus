package algorithms.array.medium;

/**
 * 图像顺时针旋转90度
 * @author haowus919@gmail.com
 * @date 2020/6/13 23:23
 */
public class question_48 {
    public void rotate(int[][] matrix) {

        int len = matrix.length;

        int[][] m = new int[len][len];
        for (int i=0;i<len;i++){
            for (int j=0;j<len;j++){

                m[i][j] = matrix[i][j] ;

            }
        }
        for (int i=0;i<len;i++){
            for (int j=0;j<len;j++){

                matrix[i][j] = m[len-j-1][i];

            }
        }
    }
}
