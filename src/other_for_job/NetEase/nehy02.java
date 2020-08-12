package other_for_job.NetEase;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author haowus919@gmail.com in lab
 * @Date 2020/8/12 19:46
 */
public class nehy02 {
//    private static int res;
    public static void main(String[] args) {
        int n = 3;
        int[][] nums = new int[][]{{1,0,0},{0,10,10},{0,10,10}};

        List<List<Integer>> out = new ArrayList<>();
        for (int i=0;i< nums.length;i++){
            for (int j=0;j<nums[0].length;j++){
                List<Integer> in = new ArrayList<>();
                int res =path(nums,i,j)+nums[i][j];
                in.add(i);
                in.add(j);
                in.add(res);
                out.add(in);


            }
        }
        System.out.println(2+" "+2);//(1,1)
        int[][] new_nums = new int[n-1][n-1];
        for (int i=0;i< new_nums.length;i++)
            for (int j=0;j< new_nums[0].length;j++){
                if (i==1 && j==0)
                    new_nums[i][j] = nums[i+1][j+1];
                else if(i==1)
                    new_nums[i][j] = nums[i+1][j];
                else if(j==0)
                    new_nums[i][j] = nums[i][j+1];
            }

        for (int i=0;i< new_nums.length;i++)
            for (int j=0;j< new_nums[0].length;j++)
                System.out.println(new_nums[i][j]);
//        Collections.sort(out, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (o1)
//                return 0;
//            }
//        });
//        System.out.println(out);

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
