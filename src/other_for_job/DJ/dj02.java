package other_for_job.DJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/10 22:02
 */
//class food{
//    int price;
//    int satisfy;
//    int num;
//
//    public food(int price, int satisfy, int num) {
//        this.price = price;
//        this.satisfy = satisfy;
//        this.num = num;
//    }
//}
//class account {
//    int totalSatisfy;
//    int[] numbers;
//
//    public account(int totalStatisfy) {
//        this.totalSatisfy = totalStatisfy;
//    }
//
//}
//public class dj02 {
//    private static int N;
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        N = in.nextInt();   //N种零食
//        int T = in.nextInt();  //一共有T块钱
//        account[] moneyMax = new account[T+1];
//        food[] foods = new food[N];
//        int result = 0;
//        for (int i = 0; i < N; i++) {
//            foods[i] = new food(in.nextInt(), in.nextInt(), in.nextInt());
//        }
//        moneyMax[0] = new account(0);
//        moneyMax[0].numbers = new int[N];
//        for (int i = 0; i < N; i++) {
//            moneyMax[0].numbers[i] = foods[i].num;
//        }
//        for (int i = 1; i <= T; i++) {
//            findMax(moneyMax, i, foods);
//            if(moneyMax[i].totalSatisfy > result)
//                result = moneyMax[i].totalSatisfy;
//        }
//        System.out.println(result);
//    }
//
//    private static void findMax(account[] moneyMax, int point, food[] foods){
//        int max = 0;
//        moneyMax[point] = new account(0);
//        moneyMax[point].numbers = new int[N];
//        for (int i = 0; i < N; i++) {
//            moneyMax[point].numbers[i] = foods[i].num;
//        }
//        for (int i = 0; i < foods.length; i++) {
//            boolean whetherBuy = false;
//            if(point - foods[i].price >= 0 && moneyMax[point - foods[i].price].numbers[i] > 0){
//                if(moneyMax[point - foods[i].price].totalSatisfy + foods[i].satisfy > max){
//                    max = moneyMax[point - foods[i].price].totalSatisfy + foods[i].satisfy;
//                    moneyMax[point].totalSatisfy = max;
//                    for (int j = 0; j < N; j++) {
//                        moneyMax[point].numbers[j] = moneyMax[point - foods[i].price].numbers[j];
//                    }
//                    moneyMax[point].numbers[i]--;
//                }
//
//            }
//        }
//    }
//}


class food implements Comparable<food>{
    int price;
    int satisfy;
    int num;

    public food(int price, int satisfy, int num) {
        super();
        this.price = price;
        this.satisfy = satisfy;
        this.num = num;
    }

    public int getPrice() {
        return price;
    }



    public int getSatisfy() {
        return satisfy;
    }



    public int getNum() {
        return num;
    }



    @Override
    public int compareTo(food o) {
        if (this.getSatisfy()>o.getSatisfy())
            return -1;
        else if (this.getSatisfy()<o.getSatisfy())
            return 1;
        else
            return 0;
    }
}

public class dj02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();  //有多少种零食
        int moneyAll = sc.nextInt(); //一共有多少钱
        List<food> list = new ArrayList<>();

        for (int i=0;i<n;i++)
            list.add(new food(sc.nextInt(),sc.nextInt(),sc.nextInt()));
        Collections.sort(list);


        int res_satisfy = 0;
        for (int i=0;i<list.size();i++){
            while (moneyAll-list.get(i).price>0 && list.get(i).num>0){
                res_satisfy += list.get(i).satisfy;
                list.get(i).num--;
                moneyAll -= list.get(i).price;
            }
        }
        System.out.println(res_satisfy);

    }
}
