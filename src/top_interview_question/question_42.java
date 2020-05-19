package top_interview_question;

public class question_42 {
    public int trap(int[] height){
        if (height==null || height.length==0) return 0;
        int index=0;
        int maxHeight = 0;
        for (int i=0;i<height.length;i++){
            if (height[i]>maxHeight){
                maxHeight = height[i];
                index = i;
            }
        }
        int templ = height[0];
        int area=0;
        for (int left=0;left<index;left++){
            if (height[left]>templ)
                templ = height[left];
            else
                area += templ-height[left];
        }
        int tempr = height[height.length-1];
        for (int right=height.length-1;right>index;right--){
            if (height[right]>tempr)
                tempr = height[right];
            else
                area += tempr-height[right];
        }
        return area;

    }
}
