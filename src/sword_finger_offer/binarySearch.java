package sword_finger_offer;

public class binarySearch {
    public int GetNumberOfK(int [] array , int k) {

        int cur = binary(array,k);
        int count=0;
        for (int i = cur;i<array.length&&array[i]==k;i++)
            count++;
        return count;


    }
    public int binary(int[] array,int k){
        int i=0,j=array.length-1,mid;
        while (i<=j){
            mid = i+(j-i)/2;
            if (array[mid]<k)
                i = mid+1;
            else
                j = mid-1;
        }
        return i;
    }
}
