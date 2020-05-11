package sortingAlgorithm;
/**
 * 计数排序。（量大范围小的数组）
 * 时间复杂度：o(n+k)
 * 空间复杂度：o(n+k)
 * 稳定性：稳定
 */
public class countSort {
    public static void main(String[] args) {
        int[] arr = {0,1,4,7,3,1,4,6,8,2,3,5,3,9};
        int[] res = sort(arr);
        //merge(arr,0,4,6);
        for (int value : res) {
            System.out.print(value+" ");
        }
    }

    static int[] sort(int[] arr){
        int[] result = new int[arr.length];
        int[] count = new int[10];
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for (int i=1;i<count.length;i++){
            count[i] = count[i]+count[i-1]; //累加数组
        }

        for (int i=arr.length-1;i>=0;i--)  //保证稳定性，相同的数，相对位置不变
            result[--count[arr[i]]] = arr[i]; //从后往前遍历，将原数组的值放入新数组中
        return result;
    }
}
