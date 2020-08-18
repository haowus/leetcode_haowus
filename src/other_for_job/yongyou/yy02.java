package other_for_job.yongyou;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/18 16:02
 */
public class yy02 {
    /**
     * 将矩阵的二维数组进行上下翻转处理
     * @param matrix int整型二维数组 矩阵
     * @return int整型二维数组
     */
    public int[][] convert (int[][] matrix) {
        // write code here
//        int n= matrix.length;
//        int m =  matrix[matrix.length-1].length;
//        int[][] res = new int[n][m];
//        int right = n-1;
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++)
//                res[right][j] = matrix[i][j];
//            right--;
//        }
//        return res;
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] res = new int[n][m];
        int right = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                res[right][j] = matrix[i][j];
            right--;
        }
        return res;
    }
}
