package other_for_job.wanmei;

import java.util.*;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/25 20:33
 */
public class wm04 {
    static List<List<Integer>> res = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0;i<n;i++)
            nums[i] = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){  //统计原数组中的值和出现的次数
            map.put(i,map.containsKey(i) ? map.get(i) + 1 : 1);
        }
        int len = map.size();
        int[] numSet = new int[len]; //把数字去重放入此数组
        int[] numCount = new int[len];  //存放数字出现的次数
        int index = 0;
        Set<Integer> set = map.keySet();//遍历Hash表
        for (Integer s : set) {//保证两个数组内数字的对应关系
            numSet[index] = s;
            numCount[index ++] = map.get(s);
        }

        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums.length, numSet,numCount,track);
        System.out.println(res);
        int ans =0;
        for (int i=0;i<res.size();i++)
            if (isPerfect(res.get(i)))
                ans++;
        System.out.println(ans);


    }
    private static void backtrack(int len,int[] numSet, int[] numCount,LinkedList<Integer> track){
        if (track.size()==len){
            res.add(new LinkedList<>(track));
            return;
        }
        for (int i=0;i<numSet.length;i++){
            if (numCount[i]>0){
                numCount[i]--;
                track.add(numSet[i]);
                backtrack(len, numSet,numCount,track);
                numCount[i]++;
                track.removeLast();
            }
        }
    }
    private static boolean isPerfect(List<Integer> list){
        for (int i=0;i<list.size()-1;i++){
            int sum = list.get(i)+list.get(i+1);
            int num_sqrt = (int) Math.sqrt(sum);
            if (num_sqrt*num_sqrt!=sum)
                return false;
        }
        return true;

    }
}
