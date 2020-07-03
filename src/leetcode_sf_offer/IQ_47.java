package leetcode_sf_offer;

/**
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/1 21:59
 * 在原数组上面改动，先横竖  再对角线
 */
public class IQ_47 {

    public int maxValue(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        for (int i=1;i<cols;i++)
            grid[0][i] += grid[0][i-1];
        for (int i=1;i<rows;i++)
            grid[i][0] += grid[i-1][0];
        for (int i=1;i<rows;i++)
            for (int j=1;j<cols;j++)
                grid[i][j] = Math.max(grid[i-1][j],grid[i][j-1])+grid[i][j];
        return grid[rows-1][cols-1];

    }

}
