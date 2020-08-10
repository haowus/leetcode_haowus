package other_for_job.xunfei;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 数字圆环
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/7 15:56
 */
public class wy02 {
    private static List<LinkedList<Integer>> res = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[]{1,2,3};
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums,track);
        System.out.println(res);

    }
    private static void backtrack(int[] nums, LinkedList<Integer> track){
        if (track.size()==nums.length ){
            res.add(new LinkedList<>(track));
            return ;

        }
        for (int i=0;i<nums.length;i++){
            if (track.contains(nums[i]))
                continue;
            track.add(nums[i]);
            backtrack(nums,track);
            track.removeLast();
        }

    }
    private static boolean isCircle(LinkedList<Integer> track){
        for (int i=0;i<track.size();i++){
            if (i==0){
                if (track.get(i)>=track.get(1)+track.getLast())
                    return false;
            }
            else if(i==track.size()-1){
                if (track.get(i)>=track.getFirst()+track.get(i-1))
                    return false;
            }
            else if (track.get(i)>=track.get(i+1)+track.get(i-1))
                return false;
        }
        return true;
    }
}
