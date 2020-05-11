package sortingAlgorithm;
/**
 * 冒泡排序。（太慢，基本不用）
 * 时间复杂度：最差：o(n^2)  最好：o(n)  平均：o(n^2)
 * 空间复杂度：o(1)
 * 稳定性：稳定，
 */
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,4,5,1,3,7,6};
        sort(arr);
        for (int value : arr) {
            System.out.println(value);
        }
    }
    static void sort(int[] arr){
        for (int i=arr.length-1;i>0;i--){//外层循环，保证每次内层循环，去掉最后一个排好的
            for (int j=0;j<i;j++)  //内层循环，两两交换，把最大值放到最后
                if (arr[j]>arr[j+1])
                    swap(arr,j,j+1);
        }

    }
    static void swap(int[] arr, int i, int j){
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }
}
