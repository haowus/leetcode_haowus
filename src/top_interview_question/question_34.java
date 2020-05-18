package top_interview_question;

public class question_34 {
    public static int[] searchRange(int[] nums, int target) {

        int i = 0, j = nums.length;
        int mid = (i + j) / 2;
        int p = -1;
        while (i < j) {  //找到target的位置
            if (nums[mid] == target) {
                p = mid;
                break;
            }
            if (nums[mid] > target) {
                if (j == mid) break;
                j = mid;
                mid = (i + j) / 2;
            } else {
                if (i == mid) break;
                i = mid;
                mid = (i + j) / 2;
            }
        }

        if (p == -1) {
            return new int[]{-1, -1};
        } else {  //在target所在位置向前向后查找
            int a = p, b = p;
            while (a > 0 && nums[a - 1] == target) a--;
            while (b < nums.length - 1 && nums[b + 1] == target) b++;
            return new int[]{a, b};
        }

    }

    public static void main(String[] args) {
        searchRange(new int[]{4,5,7,7,8,8,8,10},8);
//        System.out.println(index);
        System.out.println(6/2);
    }
}
