import java.util.Scanner;

/**
 * 单词搜索
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/9/8 18:47
 */
public class xiaomi02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        if (exist(board,s))
            System.out.println("true");
        else
            System.out.println("false");
    }
    public static boolean exist(char[][] board,String word){
        if (board==null||board.length==0||word==null) return false;
        char[] w = word.toCharArray();
        for (int i=0;i< board.length;i++)
            for (int j=0;j<board[0].length;j++){
                if (exist(board,w,i,j,0))
                    return true;
            }
        return false;
    }
    private static boolean exist(char[][] board, char[] word, int i, int j, int k) {
        if (k== word.length) return true;
        if (i== board.length||i<0||j== board[0].length||j<0)
            return false;
        if (board[i][j]!=word[k]) return false;
        board[i][j]=0;
        boolean ans = exist(board, word, i + 1, j, k + 1) ||
                exist(board, word, i -1, j, k + 1)||
                exist(board, word, i, j+1, k+1)||
                exist(board, word, i, j-1, k+1);
        board[i][j]=word[k];
        return ans;
    }
}
