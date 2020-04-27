package sortingAlgorithm;
/**
 * 选择排序。（基本不用，不稳）
 * 时间复杂度：最差：o(n^2)  最好：o(n^2)  平均：o(n^2)
 * 空间复杂度：o(1)
 * 稳定性：不稳定
 */
public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,5,1,3,7};
        sort(arr);
        for (int value : arr) {
            System.out.println(value);
        }
    }
    static void sort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            int minPos = i;  //循环得到最小值所在数组的位置下标
            for (int j=i+1;j<arr.length;j++){
                minPos = (arr[j]<arr[minPos])?j:minPos;
            }
            swap(arr,minPos,i);
        }
    }
    static void swap(int[] arr, int i, int j){
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }
}
