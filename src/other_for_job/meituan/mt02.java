package other_for_job.meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/15 16:46
 */


class City{
    String s_a;
    String s_b;

    public City(String s_a, String s_b) {
        this.s_a = s_a;
        this.s_b = s_b;
    }
}
public class mt02 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        List<City> list = new ArrayList<>();
        for (int i=0;i<n;i++)
            list.add(new City(sc.next(),sc.next()));
        int res =0;
        for (int i=0;i<list.size();i++){
            String start = list.get(i).s_a;
            for (int j=i+1;j<list.size();j++){
                String end = list.get(j).s_b;
                if (start.equals(end)){
                    res++;
                    i = j;
                    break;
                }
            }
        }
        System.out.println(res);

    }
}
