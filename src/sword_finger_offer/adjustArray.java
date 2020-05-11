package sword_finger_offer;

import java.util.LinkedList;
import java.util.Queue;

public class adjustArray {
    public void reOrderArray(int [] array) {

        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        for (int i =0;i<array.length;i++){
            if (array[i]/2!=0)
                l1.add(array[i]);
            else
                l2.add(array[i]);
        }
        for (int i=0;i<l1.size();i++)
            array[i] = (int) l1.get(i);
        for (int i=0;i<l2.size();i++)
            array[l1.size()+i] = (int) l2.get(i);
    }
}
