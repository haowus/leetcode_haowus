package TEST;

import java.util.*;

public class cat_feature {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();    //1 ---测试用例的个数
        int M = sc.nextInt();     //8  ----帧的个数
        for(int i = 0; i < N; ++i){
            int r = 1;
            List<Set<List<Integer>>> v = new ArrayList<>();
            for(int j = 0; j < M; ++j){//输入部分开始
                int n = sc.nextInt();   //2 --- feature的个数
                Set<List<Integer>> temp = new HashSet<>();
                for(int k = 0; k < n; ++k){
                    int a = sc.nextInt();    //1---feature（a,b）中的a
                    int b = sc.nextInt();    //1---feature（a,b）中的b
                    List<Integer> c = new ArrayList<>();  //用 数组列表 c  装起来
                    c.add(a);
                    c.add(b);
                    temp.add(c);   //把一个feature（a,b）放入Set中
                }
                v.add(temp);  //把feature集装入数组列表中。
            }//输入部分结束
            System.out.println(v);
        }
    }
}

