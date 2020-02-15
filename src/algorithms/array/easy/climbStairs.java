package algorithms.array.easy;

public class climbStairs {
    public int minCostClimbingStairs(int[] cost) {
//dynamic programming 动态规划
        int pre = 0;
        int cur = 0;
        for(int i = 0;i<cost.length;i++){
            int temp = cur;
            cur = Math.min(pre,cur)+cost[i];   //第i阶梯的花费：第i阶的cost + 由第i-1或i-2阶蹦上来的花费
            pre = temp;
        }
        return Math.min(pre,cur);



    }
}
