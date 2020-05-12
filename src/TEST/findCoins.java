package TEST;

import java.util.Scanner;

public class findCoins {
    public static void main(String[] args) {
        int[] coins = new int[]{64,16,4,1};
        Scanner sc = new Scanner(System.in);
        int dec = 1024-sc.nextInt();
        int count = 0;
        for (int i=0;i<coins.length;i++){
            if (dec<=0)
                break;
            count += dec/coins[i];
            dec = dec%coins[i];
        }
        System.out.println(count);
    }
}
