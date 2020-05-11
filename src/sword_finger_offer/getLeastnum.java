package sword_finger_offer;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class getLeastnum {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        if (k<1||input.length<k ) return new ArrayList<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2-o1);
        //优先队列，默认是升序，即最小的优先出来。
        for (int num:input){
            if (pq.size()<k){
                pq.add(num);
                continue;   //在本次循环中，continue之后的语句不执行。
            }

            if (pq.size()>=k && pq.peek()>num){
                pq.poll();
                pq.add(num);
            }

        }
        return new ArrayList<>(pq);


    }

    public static void main(String[] args) {
        System.out.println(new getLeastnum().GetLeastNumbers_Solution(new int[]{2,3,6,4,7,5},3));
    }
}
