package other_for_job.tencent;

import java.util.*;

public class tc02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int out = (int)(n * Math.pow(2,n-1))%1000000007;
        System.out.println(out);
    }
}



