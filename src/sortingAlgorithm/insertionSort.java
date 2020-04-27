package sortingAlgorithm;
/**
 * 插入排序。（样本小且基本有序的时候效率比较高）
 * 时间复杂度：最差：o(n^2)  最好：o(n)  平均：o(n^2)
 * 空间复杂度：o(1)
 * 稳定性：稳定
 */
public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,5,1,3,7,6};
        sort(arr);
        for (int value : arr) {
            System.out.println(value);
        }
    }
    static void sort(int[] arr){
        for (int i=1;i<arr.length;i++){
            for (int j=i;j>0;j--){   //把第i个数插入到前i-1个数中，保持前i个数从小到大排列
                if (arr[j]<arr[j-1])
                    swap(arr,j,j-1);

            }
        }

    }
    static void swap(int[] arr,int i,int j){
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }
}
