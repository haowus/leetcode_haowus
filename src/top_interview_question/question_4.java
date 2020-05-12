package top_interview_question;

public class question_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] res = merge(nums1,nums2);
        double out=0.0;
        int len = res.length;
        if (len%2 !=0)
            out = res[len/2];
        else
            out = (double) (res[len/2]+res[len/2+1])/2;

        return out;


    }
    private int[] merge(int[] nums1, int[] nums2){
        int i=0,j=0;
        int k = 0;
        int[] res = new int[nums1.length+nums2.length];

        while (i<nums1.length && j<nums2.length){
            if (nums1[i]<=nums2[j] ){
                res[k++] = nums1[i++];
            }
            else{
                res[k++] = nums2[j++];
            }
        }


        while (i<nums1.length) res[k++]=nums1[i++];
        while (j<nums2.length) res[k++]=nums2[j++];

        return res;
    }
}
