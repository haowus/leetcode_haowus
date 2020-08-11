package other_for_job.conch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/11 19:38
 */


class channel implements Comparable<channel>{

    int u;
    int v;
    int a;
    int b;
    int contain;

    public channel(int u, int v, int a, int b,int contain) {
        this.u = u;
        this.v = v;
        this.a = a;
        this.b = b;
        this.contain = contain;
    }

    @Override
    public int compareTo(channel o) {
        if (this.contain>o.contain)
            return -1;
        else if (this.contain<o.contain)
            return 1;
        else
            return 0;
    }

}
public class conch04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cities = sc.nextInt();
        int channels = sc.nextInt();
        List<channel> list = new ArrayList<>();
        for (int i=0;i<channels;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int contain = container(a,b);
            list.add(new channel(u,v,a,b,contain));
        }
        Collections.sort(list);  //按航路载客量排序 降序




//        for (int i=0;i<list.size();i++)
//            System.out.println(list.get(i).a+"--"+list.get(i).b);
    }
    private static int container(int a,int b){
        if (b==0 || b==a) return 1;

        else
            return container(a-1,b)+container(a-1,b-1);
    }

}
