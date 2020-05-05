package sword_finger_offer;

public class matrixPath_DFS {
    private int[][] visited;  //标记当前位置已经被走过了
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {

        //深度优先搜索
        visited = new int[rows][cols];
        for (int i=0;i<rows;i++)
            for (int j=0;j<cols;j++){
                if (findPath(matrix,rows,cols,i,j,str,0))  //以（i，j）为起点，开始上下左右 寻找字符串
                    return true;                             //如果没找到，把自己走过的点设置为0，换下一个节点重新开始。
            }
        return false;

    }
    private boolean findPath(char[] matrix,int rows,int cols,int x,int y,char[] str,int k){
        if (k == str.length) return true;  //递归边界,说明此时已经找完了.

        if (x<0||y<0||y>=cols||x>=rows||visited[x][y]==1) return false;

        //矩阵中当前位置的值 和 字符数组 中的值不相同
        if (matrix[x*cols+y] != str[k]) return false;

        //若相同，继续往 上下左右 方向继续寻找 字符数组中下一个值
        visited[x][y] = 1;
        if (findPath(matrix,rows,cols,x+1,y,str,k+1)) return true;
        if (findPath(matrix,rows,cols,x,y+1,str,k+1)) return true;
        if (findPath(matrix,rows,cols,x-1,y,str,k+1)) return true;
        if (findPath(matrix,rows,cols,x,y-1,str,k+1)) return true;

        //到这一步，说明以该点为起点的试探 没找到这样一条路径
        visited[x][y] =0;  //设置为0，换下一个起始节点
        return false;
    }

    public static void main(String[] args) {

        matrixPath_DFS mpd = new matrixPath_DFS();
        boolean a = mpd.hasPath("ABCEHJIGSFCSLOPQADEEMNOEADIDEJFMVCEIFGGS".toCharArray(),5,8,"SGGFIECVAASABCEHJIGQEM".toCharArray());
        System.out.println(a);
    }
}
