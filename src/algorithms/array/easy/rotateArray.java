package algorithms.array.easy;

public class rotateArray {
    public void rotate(int[] nums, int k) {


        int[] a = new int[nums.length];
        for (int i=0;i<nums.length;i++)
            a[(i+k)%nums.length]=nums[i];
        for (int j=0;j<a.length;j++)
            nums[j]=a[j];



    }
}
