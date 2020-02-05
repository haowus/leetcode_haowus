package algorithms;
//双指针
public class twoSum_2 {
    public static int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];
        int ahead=numbers.length-1,cur =0;
        while (cur<ahead){
            if (numbers[ahead]+numbers[cur]==target){
                break;
            }
            if(numbers[cur]+numbers[ahead]>target) ahead--;
            if(numbers[cur]+numbers[ahead]<target) cur++;
        }
        result[0] = cur+1;
        result[1] = ahead+1;
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2,7,11,15};
        int target = 9;
        int [] out = twoSum(numbers,target);
        for (int i=0;i<out.length;i++)
            System.out.println(out[i]);
    }
}
