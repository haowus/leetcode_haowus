package sortingAlgorithm;
/**
 * 归并排序。（递归思想）
 * 时间复杂度：o(nlogn)
 * 空间复杂度：o(n)
 * 稳定性：稳定
 */
public class mergeSort {
    public static void main(String[] args) {
//        int[] arr = {2,4,5,1,3,7,6,14,12,9,10,8,13,11,15};
        int[] arr = {1,4,7,3,6,8,9};
        sort(arr,0,arr.length-1);
        //merge(arr,0,4,6);
        for (int value : arr) {
            System.out.print(value+" ");
        }
    }
    static void sort(int[] arr,int left,int right){
        if (left==right) return;
        //分成两半
        int mid = left + (right-left)/2;
        //左边排序
        sort(arr,left,mid);
        //右边排序
        sort(arr,mid+1,right);
        //两边合并
        merge(arr,left,mid+1,right);

    }
    static void merge(int[] arr,int leftPtr,int rightPtr,int rightBound){
        int mid = rightPtr-1;
        int[] temp =new int[rightBound-leftPtr+1];

        int i=leftPtr;
        int j=rightPtr;
        int k=0;

        while (i <= mid && j <= rightBound){
            if (arr[i]<=arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i<=mid) temp[k++] = arr[i++];
        while (j<=rightBound) temp[k++] = arr[j++];
        for (int m=0;m<temp.length;m++)
            arr[m+leftPtr] = temp[m];

    }
}
