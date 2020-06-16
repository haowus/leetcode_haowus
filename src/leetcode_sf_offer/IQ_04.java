package leetcode_sf_offer;

/**
 * 面试题04. 二维数组中的查找
 * @author haowus919@gmail.com in dormitory
 * @date 2020/6/16 22:43
 */
public class IQ_04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        if(matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = n - 1;  //从右上角开始找
        while(row < m && col >= 0) {
            if(matrix[row][col] > target) {
                col--;
            }else if(matrix[row][col] < target) {
                row++;
            }else {
                return true;
            }
        }
        return false;
    }
}
