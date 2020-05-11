package sword_finger_offer;

import java.util.ArrayList;

public class sumNumber {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {

        ArrayList<Integer> res = new ArrayList<>();
        int left=0,right=array.length-1;

        while (left<right){
            //先判断是否相等
            if (array[left] + array[right] == sum){
                res.add(array[left]);
                res.add(array[right]);
                break; //跳出循环，不再执行
            }
            //再移动左右指针
            // 和 > sum  :移动右指针，使和减小；
            else if (array[left] + array[right] > sum)
                right--;
            //// 和 < sum  :移动左指针，使和增大；
            else
                left++;
        }
        return res;
    }
}
