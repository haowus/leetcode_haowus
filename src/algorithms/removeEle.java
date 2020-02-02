package algorithms;

public class removeEle {
    public static int removeElement(int[] nums, int val) {
        int cur=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val) {
                nums[cur] = nums[i];
                cur++;
            }
        }
        return cur;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        int a = removeElement(nums,val);
        System.out.println(a);
    }
}
