package algorithms.array.easy;

import java.util.ArrayList;
import java.util.List;

public class maxStockprofit {
    public static int maxProfit(int[] prices){
        int max =0;
        List<Integer> maxArr = new ArrayList<>();
        for (int cur=0;cur<prices.length;cur++){
//            int car = 0;
            for (int ahead = cur+1;ahead<prices.length;ahead++){
                int compute = prices[ahead]-prices[cur];
                if (compute>max){
                    max=compute;
//                    car=ahead;
                }
            }


        }
        System.out.println(maxArr);
        return max;

    }

    public static void main(String[] args) {
        int [] prices = new int[]{7,1,5,3,6,4};
//        int [] prices = new int[]{7,6,5,4,3};
        int out = maxProfit(prices);
        System.out.println(out);
    }
}
