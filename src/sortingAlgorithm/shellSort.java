package sortingAlgorithm;
/**
 * 希尔排序。（改进的插入排序）
 * 时间复杂度：o(n^1.3)
 * 空间复杂度：o(1)
 * 稳定性：不稳定
 */
public class shellSort {

    public static void main(String[] args) {
        int[] arr = {2,4,5,1,3,7,6,14,12,9,10,8,13,11,15};
        sort(arr);
        for (int value : arr) {
            System.out.print(value+" ");
        }
    }
    static void sort(int[] arr){
        int h = 1;
        while (h<arr.length/3)
            h = h*3+1;           //knuth序列用于产生间隔值gap

        for (int gap=h;gap>0;gap=(gap-1)/3){
            for (int i=gap;i<arr.length;i++){
                for (int j=i;j>gap-1;j-=gap){//在原数组中，每间隔gap取一个值 组成新的数组，对新数组进行插入排序
                    if (arr[j]<arr[j-gap])
                        swap(arr,j,j-gap);
                }
            }
        }


    }
    static void swap(int[] arr,int i,int j){
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }
}
