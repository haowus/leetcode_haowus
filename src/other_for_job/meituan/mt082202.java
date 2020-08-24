package other_for_job.meituan;

import java.util.*;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/22 16:28
 */

class Order{
    int number;
    int value;
    int weight;
    int earn;

    public Order(int number, int value, int weight, int earn) {
        this.number = number;
        this.value = value;
        this.weight = weight;
        this.earn = earn;
    }
}
public class mt082202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Order> orders = new ArrayList<>();
        for (int i=0;i<n;i++){
            int number = i+1;
            int value = sc.nextInt();
            int weight = sc.nextInt();
            int earn = value+2*weight;
            orders.add(new Order(number,value,weight,earn));
        }

        Collections.sort(orders, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.earn>o2.earn)
                    return -1;
                else if (o1.earn<o2.earn)
                    return 1;
                else{
                    return 0;
                }
            }
        });

        List<Order> res = new ArrayList<>();

        for (int i=0;i<m;i++){
            res.add(orders.get(i));
        }
        Collections.sort(res, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.number>o2.number)
                    return 1;
                else if (o1.number<o2.number)
                    return -1;
                else{
                    return 0;
                }
            }
        });
        for (int i=0;i<res.size();i++)
            System.out.print(res.get(i).number+" ");
    }
}
