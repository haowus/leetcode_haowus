package sword_finger_offer;

import java.util.ArrayList;

public class clockwise_matrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;
        ArrayList<Integer> res = new ArrayList<>();
        int i=0;
        for (int j=0;j<col;j++){
            res.add(matrix[i][j]);
            if (j==col){
                i += col;
            }
        }
        return new ArrayList<>();

    }
}
