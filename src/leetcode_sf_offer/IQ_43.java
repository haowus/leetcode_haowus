package leetcode_sf_offer;

/**
 * 剑指 Offer 43. 1～n整数中1出现的次数
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/30 21:36
 * 输入12，1～12这些整数中包含1 的数字有1、10、11和12，1一共出现了5次。
 */
public class IQ_43 {
    public int countDigitOne(int n) {

        //超时
        int count=0;
        for (int i=1;i<=n;i++){
            int cur = i;
            while (cur!=0){

                if(cur%10==1)
                    count++;
                cur = cur/10;
            }
        }
        return count;
    }
}
