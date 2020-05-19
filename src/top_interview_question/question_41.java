package top_interview_question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class question_41 {
    public static int firstMissingPositive(int[] nums) {
        int len = nums.length;

        Set<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }

        for (int i = 1; i <= len ; i++) {
            if (!hashSet.contains(i)){
                return i;
            }
        }

        return len + 1;
    }

    public static void main(String[] args) {
        int [] num = new int[]{3,4,-1,1};
        System.out.println(firstMissingPositive(num));
    }
}
