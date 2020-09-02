package other_for_job.fiveeight;

import java.util.*;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/31 20:54
 */
public class fe01 {
    public static ArrayList<String> findCommonString (ArrayList<ArrayList<String>> values) {
        // write code here
        ArrayList<String> res = new ArrayList<>();

        Collections.sort(values, new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                if (o1.size()>o2.size())
                    return 1;
                else if (o1.size()<o2.size())
                    return -1;
                else
                    return 0;
            }
        });
        ArrayList<String> shortlist = values.get(0);
        Set<String> set = new TreeSet<>();

        for (int i=0;i< shortlist.size();i++){
            int count=0;
            for (int j=1;j< values.size();j++){
                if (values.get(j).contains(shortlist.get(i))){
                    count++;
                }
            }
            if (count== values.size()-1)
                set.add(shortlist.get(i));
        }
        return new ArrayList<>(set);

    }

    public static void main(String[] args) {
        String[] aa = new String[]{"a", "adb", "gae", "ddd", "you", "better", "aaaaa"};
        ArrayList<String> a = new ArrayList<>(Arrays.asList(aa));


        ArrayList<String> b = new ArrayList<>(Arrays.asList(new String[]{"a1", "adb", "g2ae", "dd1d", "you", "better", "aaabaa"})) ;
        ArrayList<String> c = new ArrayList<>(Arrays.asList(new String[]{"2a1", "adb2", "g2ae", "ddd", "you", "better", "aaabaa"}));
        ArrayList<ArrayList<String>> values = new ArrayList<>();
        values.add(a);
        values.add(b);
        values.add(c);
        System.out.println(findCommonString(values));

    }
}
