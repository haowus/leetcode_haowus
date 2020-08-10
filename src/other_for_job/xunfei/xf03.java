package other_for_job.xunfei;

import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/7/31 14:33
 */
public class xf03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String a = sc.nextLine();
            String[] ar = a.split(" ");
            int[] arr = new int[ar.length];
            for (int i=0;i<ar.length;i++){
                arr[i] = Integer.valueOf(ar[i]);
            }
            int minx1 = arr[0];
            int maxx1 = arr[2];
            int miny1 = arr[1];
            int maxy1 = arr[3];
            if (arr[0]>arr[2]){
                minx1 = arr[2];
                maxx1 = arr[0];
            }
            if (arr[1]>arr[3]){
                miny1 = arr[3];
                maxy1 = arr[1];
            }

            int minx2 = arr[4];
            int maxx2 = arr[6];
            int miny2 = arr[5];
            int maxy2 = arr[7];
            if (arr[4]>arr[6]){
                minx2 = arr[6];
                maxx2 = arr[4];
            }
            if (arr[5]>arr[7]){
                miny2 = arr[7];
                maxy2 = arr[5];
            }

            if (maxy2<miny1 || minx2>maxx1 || miny2>maxy1 || maxx2<minx1)
                System.out.println(0);
            else
                System.out.println(1);


        }
    }
}
