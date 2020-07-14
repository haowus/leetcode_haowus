package leetcode_sf_offer;

/**
 * 剑指 Offer 67. 把字符串转换成整数
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/7/14 22:11
 * 注意越界  >7
 */
public class IQ_67 {
    public int strToInt(String str) {


        str = str.trim();
        if (str.length()==0) return 0;
        int i=0;
        int sign =1 ;  //标识正负号
        if (str.charAt(i)=='-'){
            sign = -1;
            i++;
        }
        else if (str.charAt(i)=='+'){
            i++;
        }

        int res = 0;
        //开始循环
        while (i<str.length()){
            if (str.charAt(i)>='0' && str.charAt(i)<='9'){

                if (res>Integer.MAX_VALUE/10 || res==Integer.MAX_VALUE/10 && str.charAt(i)>'7')
                    return Integer.MAX_VALUE;
                else if (res<Integer.MIN_VALUE/10 || res==Integer.MIN_VALUE/10 && str.charAt(i)>'7')
                    return Integer.MIN_VALUE;
                res = res*10 + sign*(str.charAt(i)-'0');
            }
            else
                return res;

            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        IQ_67 iq_67 = new IQ_67();
        System.out.println(iq_67.strToInt("2147483648"));
    }
}
