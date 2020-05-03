package sword_finger_offer;

import java.util.Arrays;

public class continuous_pack {
    public boolean isContinuous(int [] numbers) {

        if (numbers==null || numbers.length==0) return false;
        Arrays.sort(numbers);
        int nums_zero = 0;
        for (int i:numbers)
            if (i==0) nums_zero++;

        int sum = 0;
        for (int i=0;i<numbers.length-1;i++){
            int a = numbers[i],b=numbers[i+1];
            if (a==0 || b ==0) continue;
            if (a==b) return false;
            sum += b-a+1;  //排序过，所以可以通过前后数之差判断需要几个大小王；
        }
        return (nums_zero != 0 && sum == nums_zero) || sum == 0;


    }
}
