package leetcode_sf_offer;

/**
 * 剑指 Offer 66. 构建乘积数组
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/13 22:39
 */
public class IQ_66 {
    public int[] constructArr(int[] a) {
        if(a==null || a.length==0) return new int[0];
        int[] B = new int[a.length];
        B[0] = 1;
        for (int i=1;i<a.length;i++)
            B[i] = B[i-1]*a[i-1];    //B的左边
        int temp=1;
        for (int i=a.length-2;i>=0;i--){
            temp*=a[i+1];
            B[i] = B[i] * temp;      //B的右边
        }
        return B;
    }
}
