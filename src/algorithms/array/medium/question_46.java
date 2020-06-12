package algorithms.array.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 全排列
 * @author haowus919@gmail.com
 * @date 2020/6/12 22:04
 */
public class question_46 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        track(nums,list);
        return res;

    }
    private void track(int[] nums,LinkedList<Integer> list){
        if (list.size()==nums.length){
            res.add(new LinkedList<>(list));
            return;
        }


        for (int i=0;i<nums.length;i++){
            if (!list.contains(nums[i]))
                list.add(nums[i]);

            track(nums,list);
            list.removeLast();
        }

    }
}
