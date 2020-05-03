package sword_finger_offer;

public class onlyAppearOne {

    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {

        int res=0;
        for (int i:array)
            res ^= i;  //res:两个出现一次的数的异或结果

        int index=1;
        while ((index & res)==0)   //1&7==1
            index = index << 1;   //从右往左，找出为1的那一位

        int result1=0,result2=0;
        for (int i=0;i<array.length;i++){
            if ((index & array[i])==0) result1 ^= array[i];
            else result2 ^= array[i];
        }
        num1[0] = result1;
        num2[0] = result2;

    }
}
