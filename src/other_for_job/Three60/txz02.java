package other_for_job.Three60;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/22 20:26
 */
public class txz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();//换行
        int[] operation = new int[m];
        for (int i=0;i<m;i++)
            operation[i] = sc.nextInt();
        int [] num = new int[n];
        for (int i=0;i<n;i++)
            num[i] = i+1;
        for (int i=0;i< operation.length;i++){
            if (operation[i]==1)
                one(num);
            else if (operation[i]==2)
                two(num);
        }
        for (int i:num)
            System.out.print(i+" ");
    }
    private static void one(int[] num){
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i=1;i< num.length;i++)
            ll.addLast(num[i]);
        ll.addLast(num[0]);

        for (int i=0;i< num.length;i++)
            num[i] = ll.pollFirst();
    }

    private static void two(int[] num){
        for (int i=0;i< num.length;i+=2){
            swap(num,i,i+1);
        }
    }
    private static void swap(int[] num,int i,int j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}
