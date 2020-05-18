package top_interview_question;

public class question_11 {
    public int maxArea(int[] height) {

        int left =0,right=height.length-1;
        int res = 0;
        while(left<right){
            if (height[left]<height[right])
                res = Math.max(res,(right-left)*height[left++]);
            else
                res = Math.max(res,(right-left)*height[right--]);
        }
        return res;



    }

}
