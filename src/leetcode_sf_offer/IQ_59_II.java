package leetcode_sf_offer;

import java.util.*;

/**
 * 剑指 Offer 59 - II. 队列的最大值
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/7/11 20:10
 */
public class IQ_59_II {
    Queue<Integer> queue = new LinkedList<>();
    Deque<Integer> deque = new LinkedList<>();
    public int max_value() {
        return deque.isEmpty()?-1:deque.getFirst();
    }

    public void push_back(int value) {
        queue.add(value);
        while (!deque.isEmpty() && deque.getLast()<value)
            deque.removeLast();
        deque.add(value);
    }

    public int pop_front() {
        int res = 0;
        if (!queue.isEmpty()){
            if(queue.peek().equals(deque.getFirst()))
                deque.removeFirst();
            res = queue.poll();
        }
        else
            res =  -1;

        return res;
    }
}
