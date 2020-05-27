package algorithms.tree.medium;

public class question_96 {


    //动态规划
    public static int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;  //空树也是BST
        dp[1] = 1;

        for (int i = 2; i < n+1; i++)
            for (int j = 1; j <= i; j++){
                dp[i]  +=  dp[j-1] * dp[i-j];
            }


        return dp[n];
    }

    public static void main(String[] args) {
        numTrees(3);
    }
}
