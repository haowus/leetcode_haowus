package other_for_job;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/9/5 18:39
 */
public class sougou02 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 返回能创建的房屋数
     * @param t int整型 要建的房屋面宽
     * @param xa int整型一维数组 已有房屋的值，其中 x0 a0 x1 a1 x2 a2 ... xi ai 就是所有房屋的坐标和房屋面宽。 其中坐标是有序的（由小到大）
     * @return int整型
     */
    public static int getHouses (int t, int[] xa) {
        // write code here

        if (xa.length==2) return 2;
        int count=0;
        for (int i=0;i< xa.length-2;i+=2){
            int j = i+2;
            double secondL = xa[j] - (double)xa[j+1]/2;
            double firstR = xa[i]+(double)xa[i+1]/2;

            if (secondL-firstR>t)
                count+=2;
            else if (secondL-firstR==t)
                count+=1;
        }
        return count+2;
    }

    public static void main(String[] args) {
        int t = 2;
        int[] xa = new int[]{-1,4,5,2};
//        System.out.println(getHouses(t,xa));
        System.out.println((3-(double) 5/2)-1);
    }
}
