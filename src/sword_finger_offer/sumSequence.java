package sword_finger_offer;

import java.util.ArrayList;
//滑动窗口
public class sumSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        if (sum<3) return res;
        int left = 1,right = 2;
        int corsum = left+right;
        while (left<right && right<sum){
            while (corsum > sum && left<sum/2){
                corsum -= left;
                left++;
            }
            if (corsum==sum) res.add(getSequence(left,right));
            right++;
            corsum+=right;

        }
        return res;


    }
    private ArrayList<Integer> getSequence(int start, int end){
        ArrayList<Integer> seq = new ArrayList<>();
        for (int i=start;i<=end;i++)
            seq.add(i);
        return seq;
    }
}
