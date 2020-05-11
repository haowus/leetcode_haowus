package sword_finger_offer;

//public class inversePair {
//
//    int count;
//
//    public static void main(String[] args) {
//
//        inversePair ip = new inversePair();
//        int a = ip.InversePairs(new int[]{1,2,3,4,5,6,7,0});
//
//        System.out.println(a%1000000007);
//
//    }
//
//    public int InversePairs(int[] array) {
//
//        sort(array,0,array.length-1);
//        return count;
//
//    }
//
//    void sort(int[] arr,int left,int right){
//        if (left==right) return;
//        //分成两半
//        int mid = left + (right-left)/2;
//        //左边排序
//        sort(arr,left,mid);
//        //右边排序
//        sort(arr,mid+1,right);
//        //两边合并
//
//
//    }
//    void merge(int[] arr, int leftPtr, int rightPtr, int rightBound){
//        int mid = rightPtr-1;
//        int[] temp =new int[rightBound-leftPtr+1];
//
//        int i=leftPtr;
//        int j=rightPtr;
//        int k=0;
//
//
//        while (i <= mid && j <= rightBound){
//            if (arr[i]<=arr[j]){
//                temp[k] = arr[i];
//                i++;
//                k++;
//            }else {
//                temp[k] = arr[j];
//                j++;
//                k++;
//                count++;
//            }
//        }
//        while (i<=mid) temp[k++] = arr[i++];
//        while (j<=rightBound) temp[k++] = arr[j++];
//        for (int m=0;m<temp.length;m++)
//            arr[m+leftPtr] = temp[m];
//
//    }
//}


public class inversePair {
    private int cnt;
    private void MergeSort(int[] array, int start, int end){
        if(start>=end)return;
        int mid = (start+end)/2;
        MergeSort(array, start, mid);
        MergeSort(array, mid+1, end);
        MergeOne(array, start, mid, end);
    }
    private void MergeOne(int[] array, int start, int mid, int end){
        int[] temp = new int[end-start+1];
        int k=0,i=start,j=mid+1;
        while(i<=mid && j<= end){
//如果前面的元素小于后面的不能构成逆序对
            if(array[i] <= array[j])
                temp[k++] = array[i++];
            else{
//如果前面的元素大于后面的，那么在前面元素之后的元素都能和后面的元素构成逆序对
                temp[k++] = array[j++];
                cnt = (cnt + (mid-i+1))%1000000007;
            }
        }
        while(i<= mid)
            temp[k++] = array[i++];
        while(j<=end)
            temp[k++] = array[j++];
        for(int l=0; l<k; l++){
            array[start+l] = temp[l];
        }
    }
    public int InversePairs(int [] array) {
        MergeSort(array, 0, array.length-1);
        return cnt;
    }
}

