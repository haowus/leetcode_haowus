package other_for_job.others;

/**
 * @Author haowus919@gmail.com in lab
 * @Date 2020/9/4 19:49
 */
public class bililc02 {
    public static void main(String[] args) {
        int[] num = new int[]{1,2,3,4};
        System.out.println(cal_common_factor(num));
    }
    public static int cal_common_factor(int[] L){
        return getMoreBigDiv(L, L.length);
    }

    public static int getBigDiv(int a, int b) {// 求两个数的最大公约数
        if (b == 0)
            return a;
        return getBigDiv(b, a % b);
    }

    public static int getMoreBigDiv(int[] num, int n) { // 求多个数的最大公约数
        if (n == 1)
            return num[n - 1];
        return getBigDiv(num[n - 1], getMoreBigDiv(num, n - 1));
    }
}
