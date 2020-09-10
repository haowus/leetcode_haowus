package other_for_job.shence;

import java.util.Scanner;
public class redbook01 {
    static int maxn=20;
    static int INF=2147483647;
    static int ans=INF;
    static int[] vish = new int[maxn];
    static int[][] hc = new int[maxn][maxn];
    static int[] lc= new int[maxn];
    static int[][] f = new int[maxn][maxn];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        int r =sc.nextInt();
        int c =sc.nextInt();
        int[][] matrix = new int[maxn][maxn];
        for (int i=1;i<=n;i++)
            for (int j=1;j<=m;j++)
                matrix[i][j] = sc.nextInt();
        dfs(1,0,r,n,m,c,matrix);
        System.out.println(ans);
    }
    private static void dfs(int k,int j,int r,int n,int m,int c,int[][] matrix){
        if (k==r+1){
            Memset(m,r,matrix);
            makeans(m,c);
            return ;
        }
        for(int i=j+1; i<=n; i++) {
            vish[k]=i;
            dfs(k+1,i,r,n,m,c,matrix);
        }
    }
    private static void makeans(int m,int c) {
        f[1][1]=lc[1];
        for(int i=2; i<=m; i++) {
            for(int j = 1; j<=(Math.min(i, c)); j++) {
                f[i][j]=INF;
                if(j==1) f[i][j]=lc[i];                              //边界
                else if(i==j) f[i][j]=f[i-1][j-1]+hc[i][j-1]+lc[i];  //边界*2
                else {
                    for(int k=i-1; k>=j-1; k--)
                        f[i][j]=Math.min(f[i][j],f[k][j-1]+hc[i][k]+lc[i]); //状态转移方程
                }
                if(j==c) ans=Math.min(ans,f[i][c]);                        //记录最小值
            }
        }
    }

    private static void Memset(int m,int r,int[][] a) {
        for(int i=1; i<=m; i++)
            lc[i]=0;
        for(int i=1; i<=m; i++)
            for(int j=1; j<=m; j++)
                hc[i][j]=0;
        for(int i=1; i<=m; i++)
            for(int j=1; j<r; j++)
                lc[i]+=Math.abs(a[vish[j]][i]-a[vish[j+1]][i]);
        for(int i=2; i<=m; i++)
            for(int j=1; j<i; j++)
                for(int k=1; k<=r; k++)
                    hc[i][j]+=Math.abs(a[vish[k]][i]-a[vish[k]][j]);
    }
}
