package other_for_job.xunfei;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/7/31 14:52
 */


import java.util.Scanner;


public class xf01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numStr = sc.nextLine().split(" ");
        int[] money = new int[5];
        for (int i=0;i<numStr.length;i++)
            money[i] = Integer.valueOf(numStr[i]);
        int sum = sc.nextInt();
        MoneyBox[] moneyBoxes = {
                new MoneyBox(1,money[0]),
                new MoneyBox(5,money[1]),
                new MoneyBox(10,money[2]),
                new MoneyBox(50,money[3]),
                new MoneyBox(100,money[4]),
        };
        int res = payCount(moneyBoxes,sum);
        System.out.println(res>0?res:-1);


    }

    private static int payCount(MoneyBox[] moneyBoxes, int sum) {
        int count =0;
        for (int i=moneyBoxes.length-1;i>=0;i--){
            int curCount = Math.min(moneyBoxes[i].getCount(),sum/moneyBoxes[i].getValue());
            sum -= curCount*moneyBoxes[i].getValue();
            count += curCount;
        }
        return sum>0?-1:count;
    }

    static class MoneyBox{

        private int value;
        private int count;

        public MoneyBox(int value, int count) {
            this.value = value;
            this.count = count;
        }

        public int getValue() {
            return value;
        }

        public int getCount() {
            return count;
        }

    }
}

