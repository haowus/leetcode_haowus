package TEST;

import java.util.Arrays;
import java.util.Scanner;

public class puke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[13];
        for (int i=0;i<13;i++)
            num[i] = sc.nextInt();

        Arrays.sort(num);


    }
}
