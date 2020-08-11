package other_for_job.conch;

import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/11 19:23
 */
public class conch03 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] nums = new int[n];
//        for (int i=0;i<nums.length;i++)
//            nums[i] = sc.nextInt();
//        int[][] dp = new int[n+1][2];
//        dp[0][0] = nums[0];
//        dp[0][1] = 1;
//        for(int i=1;i<nums.length;i++){
//            if ((dp[i-1][0]|nums[i])>nums[i]){  //nums[i]  dp[i-1][0]
//                dp[i][0] = dp[i-1][0] | nums[i];
//                dp[i][1] = dp[i-1][1]+1;
//            }
//            else {
//                dp[i][0] = nums[i];
//                dp[i][1] = 1;
//            }
//        }
//        System.out.println(dp[n-1][1]);

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();
        int[] nums = new int[len+1];
        for (int i=1;i<=len;i++)
            nums[i] = sc.nextInt();

        int max = 0;
        for (int i=1;i<=len;i++)
            max |= i;

        int[][] sum = new int[30][len+1];
        for (int bit=0;bit<30;bit++){

            for (int i=1;i<=len;i++){
                sum[bit][i] = sum[bit][i-1];
                if ((nums[i]&(1<<bit)) != 0)
                    sum[bit][i]++;
            }
        }

        int l=1,r=len;
        while (Math.abs(r-l)>1){
            int mid=(l+r)>>1;
            if (check(mid,len,sum,max)){
                r = mid;
            }else {
                l = mid+1;
            }
        }

        for (int i=Math.min(l,r);i<Math.max(l,r);i++){
            if (check(i,len,sum,max)){
                System.out.println(i);
                break;
            }
        }


    }
    private static boolean check(int mid,int len,int[][] sum,int max){
        for (int i=mid;i<=len;i++){
            int res=0;
            for (int j=0;j<30;j++){
                if (sum[j][i]-sum[j][i-mid]>0)
                    res |= (1<<j);
            }
            if (res == max)
                return true;
        }
        return false;

    }
}
