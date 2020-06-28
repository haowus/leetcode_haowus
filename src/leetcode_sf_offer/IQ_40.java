package leetcode_sf_offer;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 剑指 Offer 40. 最小的k个数
 * @author haowus919@gmail.com in dormitory
 * @date 2020/6/26 22:37
 */
public class IQ_40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k==0) return new int[0];
        //小顶堆 优先队列
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for (int i:arr){
            if (queue.size()<k)
                queue.add(i);
            else {
                if (i<queue.peek()){
                    queue.poll();
                    queue.add(i);
                }
            }
        }
        int[] res = new int[k];
        for (int i=0;i<k;i++)
            res[i] = queue.poll();
        return res;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        queue.add(1);
        queue.add(3);
        queue.add(2);
        while (!queue.isEmpty())
            System.out.println(queue.poll());
    }
}
