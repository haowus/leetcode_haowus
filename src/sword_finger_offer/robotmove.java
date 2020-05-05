package sword_finger_offer;

public class robotmove {
    private int count;
    private int[][] visited;
    public int movingCount(int threshold, int rows, int cols) {

        visited = new int[rows][cols];
        move(rows,cols,0,0,threshold);
        return count;

    }
    private void move(int rows, int cols,int x,int y,int threshold){

        if (x<0||y<0||x>=rows||y>=cols) return;   //该位置越界了，离开
        if (visited[x][y]==1) return;    //该位置访问过了，离开
        if (!isValid(x,y,threshold)) {
            visited[x][y] = 1;    //如果该位置不符合，将该位置设置为1，表明已经访问过了
            return ;
        }else {
            visited[x][y]=1;   //该位置符合，也设置为1，表明访问过了
            count++;  //符合，计数器加1；
        }

        move(rows,cols,x+1,y,threshold);
        move(rows,cols,x,y-1,threshold);
        move(rows,cols,x-1,y,threshold);
        move(rows,cols,x,y+1,threshold);

    }
    private boolean isValid(int x,int y,int threshold){
        int sum=0;
        while (x>0){
            sum += x % 10;
            x /= 10;
        }
        while (y>0){
            sum += y%10;
            y /= 10;
        }
        return sum <= threshold ? true : false;
    }
}
