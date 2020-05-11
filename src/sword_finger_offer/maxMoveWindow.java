package sword_finger_offer;

import java.util.ArrayList;

public class maxMoveWindow {

    private static ArrayList<Integer> maxInWindows(int [] num, int size) {
        if(size<1) return new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        int i=0,j=0;

        while (i<=num.length-size){
            int max =0;
            while (j-i <size){
                if (num[j]>max)
                    max = num[j];
                j++;
            }
            res.add(max);
            i++;
            j=i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxInWindows(new int[]{2, 3, 4, 2, 6, 2, 5, 1},3));
    }
}
