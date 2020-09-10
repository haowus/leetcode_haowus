package other_for_job;

import java.util.Arrays;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/9/5 19:11
 */
public class sougou01 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 返回能交换奖品的最大数量
     * @param a int整型
     * @param b int整型
     * @param c int整型
     * @return int整型
     */
    public int numberofprize (int a, int b, int c) {
        // write code here
        int[] array = new int[]{a,b,c};
        int min = Arrays.stream(array).min().getAsInt();
        return min+(Arrays.stream(array).sum()-3*min)/4;
    }
}
