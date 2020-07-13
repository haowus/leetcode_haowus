package TEST;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/13 19:27
 */
public class match00 {
    public static List<String> readCSV(int col) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\haowus\\Desktop\\knn_test.csv"));
        reader.readLine();
        String line =null;
        List<String> res = new ArrayList<>();
        int index = 0;
        //读取每行
        while ((line=reader.readLine())!=null){
            String item[] = line.split(",");

            String last = item[col-1];
//            BigDecimal bd = new BigDecimal(last);
//            double result = Double.parseDouble(last);
            res.add(last);
        }
        reader.close();
        return res;
    }
    public static List<Integer> computeSW(List<String> res){
        List<Integer> mode = new ArrayList<>();
        int l=0,r=10;    //10个一计算
        while (r<=res.size()){
            String s_l = res.get(l);
            String s_r = res.get(r);
            BigDecimal bd_s_l = new BigDecimal(s_l);
            BigDecimal bd_s_r = new BigDecimal(s_r);
            BigDecimal sub = bd_s_r.subtract(bd_s_l);
            int out = sub.divide(BigDecimal.valueOf(10)).compareTo(BigDecimal.ZERO);  //判断斜率
            mode.add(out);
            l+=10;
            r+=10;
        }
        return mode;
    }

    public static void main(String[] args) throws Exception {
        List<Integer> out = computeSW(readCSV(7));
        for (int i=0;i<out.size();i++){
            System.out.println(out.get(i));
        }

    }
}
