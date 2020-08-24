package other_for_job.meituan;

import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/22 16:23
 */
public class mt082203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int[] index=new int[n];
        for (int i=0;i<n;i++)
            index[i] = sc.nextInt();

        int[] list=new int[n];
        boolean[] flag = new boolean[n];
        int res =0;
        for (int i=0;i<n;i++){
            int maxa = 0;
            int idx = index[i];
            flag[idx-1] = true;
            arr[idx-1] = 0;
            for (int x=0;x<n;x++){
                while (!flag[x]){
                    maxa += arr[x];
                    res=Math.max(maxa,res);
                    x++;
                    if (x==n)
                        break;
                }
                maxa=0;
            }
            list[i] = res;
            res=0;
        }

        for (int i=0;i<n;i++)
            System.out.println(list[i]);
    }

}
