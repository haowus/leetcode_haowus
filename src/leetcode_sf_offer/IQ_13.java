package leetcode_sf_offer;

/**
 * 剑指 Offer 13. 机器人的运动范围
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/19 16:01
 */
public class IQ_13 {
    private int count;
    private int[][] visited;
    public int movingCount(int m, int n, int k) {
        visited = new int[m][n];
        isReachable(m,n,0,0,k);
        return count;

    }

    private void isReachable(int m,int n,int x,int y,int k){

        if (x>=m || y>= n || x<0 || y<0 || visited[x][y]==1 || (x/10 + x%10 + y/10 + y%10) > k) return;

        visited[x][y] =1;
        count++;

        isReachable(m,n,x+1,y,k);
        isReachable(m,n,x-1,y,k);
        isReachable(m,n,x,y+1,k);
        isReachable(m,n,x,y-1,k);
    }

}
