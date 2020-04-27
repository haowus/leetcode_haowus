package sortingAlgorithm;
/**
 * 基数排序。（多关键字排序）
 * 时间复杂度：o(n*k)
 * 空间复杂度：o(n+k)
 * 稳定性：稳定
 */
import java.util.Arrays;

public class radixSort {
    public static void main(String[] args) {
        int[] arr = {421,240,115,532,305,430,124};
        int[] result = sort(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] sort(int[] arr){
        int[] result = new int[arr.length];
        int[] count = new int[10]; //0~9十个数字

        for (int i=0;i<3;i++){
            int division = (int)Math.pow(10,i);   //个，十，百位
            System.out.println(division);
            for (int j=0;j<arr.length;j++){
                int num=arr[j]/division % 10;//取出数位上的数字
                System.out.print(num+" ");
                count[num]++;
            }
            System.out.println(Arrays.toString(count));
            for (int m=1;m<count.length;m++)
                count[m] = count[m] + count[m-1];//累加数组
            for (int n=arr.length-1;n>=0;n--){
                int num = arr[n]/division % 10;
                result[--count[num]] = arr[n];
            }

            System.arraycopy(result,0,arr,0,arr.length);
            Arrays.fill(count,0);  //count数组中全部填充为0
        }
        return result;
    }
}
