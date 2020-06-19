package leetcode_sf_offer;

/**
 * 剑指 Offer 12. 矩阵中的路径
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/19 15:16
 */
public class IQ_12 {
    private int[][] visited;
    public boolean exist(char[][] board, String word) {


        int rows = board.length;
        int cols = board[0].length;
        char[] words = word.toCharArray();
        visited = new int[rows][cols];

        for (int i=0;i<rows;i++)
            for (int j=0;j<cols;j++)
                if (findPath_DFS(board,words,rows,cols,i,j,0))  //以表中任一点为起点 去找路径
                    return true;
        return false;



    }

    private boolean findPath_DFS(char[][] board,char[] words,int rows,int cols,int x,int y,int k){
        //递归边界
        if (k == words.length) return true;   //

        if (x>=rows || y>= cols || x<0 || y<0 || visited[x][y]==1) return false;

        if (board[x][y] != words[k]) return false;

        visited[x][y] = 1;

        if (findPath_DFS(board,words,rows,cols,x+1,y,k+1)) return true;   //右边
        if (findPath_DFS(board,words,rows,cols,x-1,y,k+1)) return true;   //左边
        if (findPath_DFS(board,words,rows,cols,x,y+1,k+1)) return true;   //上边
        if (findPath_DFS(board,words,rows,cols,x,y-1,k+1)) return true;   //下边

        //到这一步，说明以该点为起点的试探 没找到这样一条路径
        visited[x][y] =0;  //设置为0，换下一个起始节点
        return false;

    }




}
