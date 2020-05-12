package TEST;

import java.util.Scanner;

public class skipTower {
    public static void main(String[] args) {

//        System.out.println(Math.round((double)7/2));
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] num = new int[len];
        for (int i=0;i<len;i++)
            num[i] = sc.nextInt();

        int [] score = new int[len];
        score[0] = num[len-1];
        for (int i=1;i<len;i++){
            score[i] = (int) Math.round((double) (score[i-1]+num[len-i-1])/2);
        }

        System.out.println(score[len-1]);

    }
}
