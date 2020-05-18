package top_interview_question;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class question_36 {
    public boolean isValidSudoku(char[][] board) {

        HashMap<Integer, Integer> [] rows = new HashMap [9];
        Map<Integer, Integer> [] cols = new HashMap[9];
        Map<Integer, Integer> [] boxes = new HashMap[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashMap<>();
            cols[i] = new HashMap<>();
            boxes[i] = new HashMap<>();
        }

        for (int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if (board[i][j]!='.') {
                    int num = board[i][j]-'0';
                    int boxes_num = i/3*3+j/3;

                    rows[i].put(num,rows[i].getOrDefault(num, 0) + 1);
                    cols[j].put(num,cols[j].getOrDefault(num,0) + 1);
                    boxes[boxes_num].put(num,boxes[boxes_num].getOrDefault(num, 0) + 1);

                    if (rows[i].get(num) > 1 || cols[j].get(num) > 1 || boxes[boxes_num].get(num) > 1)
                        return false;

                }
            }
        }
        return true;
    }
}
