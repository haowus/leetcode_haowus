package sword_finger_offer;

public class cutRope {
    public int cutRope(int target) {

        if (target<2) return 0;
        if (target==2) return 1;
        if (target==3) return 2;

        int[] rope = new int[target+1];
        rope[0] = 0;
        rope[1] = 1;
        rope[2] = 2;
        rope[3] = 3;
        int max = -1;
        for (int i=4;i<=target;i++){  //动态规划，一步一步填进数组
            for (int j=1;j<=i/2;j++){   //寻找最大的乘积
                int val = rope[j] * rope[i-j];
                max = max>val?max:val;
            }
            rope[i] = max;
        }
        return rope[target];
    }
}
