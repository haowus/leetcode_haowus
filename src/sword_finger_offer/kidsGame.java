package sword_finger_offer;

import java.util.ArrayList;

public class kidsGame {
    public int LastRemaining_Solution(int n, int m) {

        ArrayList<Integer> kids = new ArrayList<>();
        for (int i=0;i<n;i++)
            kids.add(i);

        int index=-1;
        while (kids.size()>1){
            int count=0;
            while (count<m){
                count++;
                index++;
                if (index == kids.size()) index=0;
            }
            kids.remove(index);
            index--;
        }
        return kids.get(0);
    }

    public static void main(String[] args) {
        ArrayList<Integer> kids = new ArrayList<>();
        for (int i=0;i<10;i++)
            kids.add(i);
        System.out.println(kids.size());
        kids.remove(4);
        System.out.println(kids.size());
    }
}
