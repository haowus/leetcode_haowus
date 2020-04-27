package sortingAlgorithm;
/**
 * 快速排序。
 * 时间复杂度：o(nlogn)  最坏情况：o(n^2)
 * 空间复杂度：o(logn)
 * 稳定性：不稳定
 */
public class quickSort {
    public static void main(String[] args) {
        int[] arr = {1,4,7,3,6,8,9};
        sort(arr,0,arr.length-1);
        //merge(arr,0,4,6);
        for (int value : arr) {
            System.out.print(value+" ");
        }
    }

    static void sort(int[] arr,int left,int right){
        if (left >= right) return;
        int mid = partition(arr, left, right);
        sort(arr,0,mid-1);
        sort(arr,mid+1, right);
    }
    static int partition(int[] arr,int leftBound,int rightBound){
        int pivot = arr[rightBound];
        int left = leftBound;
        int right = rightBound-1;
        while (left <= right){
            while (left <= right && arr[left] <= pivot)
                left++;    //一直找，直到找到左区中大于pivot的值，跳出while，此时left的值就是找到的值。
            while (left <= right && arr[right] > pivot)
                right--;

            if (left < right) swap(arr, left, right); //调换之后，再找下一组。
        }
        swap(arr, left, rightBound);
        return left;
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
