package sword_finger_offer;

import java.util.Arrays;
import java.util.Comparator;

public class minNumber {
    public String PrintMinNumber(int [] numbers) {


        String[] arr = new String[numbers.length];
        for (int i=0;i<arr.length;i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1+o2).compareTo(o2+o1);
            }
        });
        String res = "";
        for (String str:arr)
            res += str;
        return res;

    }

    public static void main(String[] args) {
        int [] a = {3,32,321};
        System.out.println(new minNumber().PrintMinNumber(a));
    }
}
