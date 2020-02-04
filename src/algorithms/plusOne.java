package algorithms;

public class plusOne {
    public static int[] plusone(int[] digits) {

        int carry = 1;
        for (int i=digits.length-1;i>=0;i--){
            if (carry ==0)
                return digits;
            int temp = digits[i]+carry;
            carry = temp/10;   //求商的整数部分
            digits[i] = temp%10;  //求商的余数部分
        }

        if (carry != 0){
            int[] newDigit = new int[digits.length+1];   //数组初值是0.   即[0,0,0,....,0]
            newDigit[0] = 1;
            return newDigit;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = new int[]{9,9};
        int[] out = plusone(digits);

        for (int j=0;j<out.length;j++){
            System.out.println(out[j]);
        }
    }

}
