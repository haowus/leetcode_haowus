package other_for_job.NetEase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in lab
 * @Date 2020/8/12 19:46
 */
class container implements Comparable<container>{
    int i;
    int j;
    int sum;

    public container(int i, int j, int sum) {
        this.i = i;
        this.j = j;
        this.sum = sum;
    }

    @Override
    public int compareTo(container o) {
        if (this.sum>o.sum)
            return -1;
        else if (this.sum<o.sum)
            return 1;
        else {
            return Integer.compare(this.i + this.j, o.i + o.j);
        }

    }
}
public class nehy02 {
//    private static int res;
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][n];
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++)
                nums[i][j] = sc.nextInt();
        process(nums,n);


    }

    private static void process(int[][] nums,int n){
        List<container> ct = new ArrayList<>();
        for (int i=0;i< nums.length;i++){
            for (int j=0;j<nums[0].length;j++){
                int res =path(nums,i,j)+nums[i][j];
                ct.add(new container(i,j,res));
            }
        }
        if (ct.size()>0){
            Collections.sort(ct);
            int o_i =ct.get(0).i;
            int o_j = ct.get(0).j;
            System.out.println((o_i+1)+" "+(o_j+1));

            int[][] arr1 = new int[n - 1][n - 1];
            int rr = 0;
            int cc = 0;
            for (int i = 0,k=0; i < n; i++) {
                if(o_i != i ){
                    for (int j = 0,t=0; j < n; j++) {
                        if (o_j != j && cc < n - 1 && rr < n - 1) {
                            arr1[k][t++] = nums[i][j];
                        }
                    }
                    k++;
                }
            }
            process(arr1,n-1);
        }
    }
    private static int path(int[][] nums,int x,int y){
        return up(nums,x,y-1) + down(nums, x, y+1)+left(nums, x-1, y)+right(nums,x+1,y);
    }
    private static int up(int[][] nums,int x,int y){
        if (y<0)
            return 0;
        else {
            return nums[x][y]+up(nums,x,y-1);
        }
    }
    private static int down(int[][] nums,int x,int y){
        if (y>= nums[0].length)
            return 0;
        else {
         return nums[x][y] + down(nums,x,y+1);
        }
    }
    private static int left(int[][] nums,int x,int y){
        if (x<0)
            return 0;
        else {

            return nums[x][y]+left(nums,x-1,y);
        }
    }
    private static int right(int[][] nums,int x,int y){
        if (x>= nums.length)
            return 0;
        else {
            return nums[x][y]+right(nums,x+1,y);
        }
    }
}
