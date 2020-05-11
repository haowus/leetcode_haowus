package sortingAlgorithm;
/**
 * 堆排序。（完全二叉树）
 * 时间复杂度：o(nlogn)
 * 空间复杂度：o(1)
 * 稳定性：不稳定
 */
public class heapSort {
    public static void main(String[] args) {
        int[] arr = {2,4,5,1,3,7};
        sort(arr);
        for (int value : arr) {
            System.out.println(value);
        }
    }
    static void sort(int[] arr){
        int len = arr.length;
        buildHeap(arr,len);   //建立堆
        for (int i=len-1;i>=0;i--){
            swap(arr,i,0);   //交换最后一个节点和根节点
            heapify(arr,i,0); //i：当前树节点的个数
        }
    }
    static void buildHeap(int[] arr,int len){  //为任意数组 建立一个大顶堆
        int lastnode = len -1;
        int parent =  (lastnode-1)/2;
        for (int i = parent;i>=0;i--)
            heapify(arr, len,i);   //对最后一个非叶子节点，从下往上heapify
    }
    static void heapify(int[] arr,int len,int i){
        int c1 = 2*i +1;
        int c2 = 2*i +2;
        int max = i;
        if (c1 < len && arr[c1]>arr[max])
            max = c1;
        if (c2 < len && arr[c2]>arr[max])
            max = c2;

        if (max!=i){
            swap(arr,max,i);
            heapify(arr,len,max);
        }

    }
    static void swap(int[] arr, int i, int j){
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }
}
