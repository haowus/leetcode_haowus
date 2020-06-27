package leetcode_sf_offer;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 剑指 Offer 41. 数据流中的中位数
 * @author haowus919@gmail.com in dormitory
 * @date 2020/6/27 21:47
 * 中位数左边放入大顶堆，右边放入小顶堆
 * 优先队列 默认是 小顶堆
 */
public class IQ_41 {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public void addNum(int num) {

        maxHeap.add(num);
        minHeap.add(maxHeap.peek());
        maxHeap.poll();

        if (maxHeap.size()<minHeap.size()){
            maxHeap.add(minHeap.peek());
            minHeap.poll();
        }

    }

    public double findMedian() {
        return maxHeap.size()>minHeap.size()?maxHeap.peek():(maxHeap.peek()+minHeap.peek())/2.0;
    }
}
