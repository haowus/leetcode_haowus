package top_interview_question;

import java.util.HashSet;
import java.util.Set;

public class question_36 {
    public boolean isValidSudoku(char[][] board) {

        int row=9,rol=9;
        for (int i=0;i<9;i++){
            Set<Character> set = new HashSet<>();
            for(int j=0;j<9;j++){
                set.add(board[i][j]);
            }
        }
        return true;
    }
}
