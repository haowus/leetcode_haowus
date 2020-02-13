package algorithms;

public class flipImage {
    public int[][] flipAndInvertImage(int[][] A) {

        int row = A.length,col = A[0].length;
        int[][] res = new int[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                res[i][j] = A[i][col-j-1];
                res[i][j] = (res[i][j]&1)==1?0:1;
            }
        }
        return res;
    }
}
