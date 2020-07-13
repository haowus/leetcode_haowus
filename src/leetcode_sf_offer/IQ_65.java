package leetcode_sf_offer;

/**
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/13 22:29
 * 位运算 头大  抄的 背吧
 */
public class IQ_65 {
    public int add(int a,int b){
        while (b!=0){
            int plus = a^b;  //求和（不计进位）
            b = ((a&b)<<1);  //计算进位，先保留为1的位，都为1的位要向左进位
            a = plus;
        }
        return a;
    }
}
