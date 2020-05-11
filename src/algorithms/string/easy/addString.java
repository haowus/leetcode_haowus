package algorithms.string.easy;

public class addString {
    public String addStrings(String num1, String num2) {

        StringBuffer sb = new StringBuffer();

        StringBuilder sB = new StringBuilder();
        int carry=0;
        int len1=num1.length()-1,len2=num2.length()-1;
        while (len1>=0||len2>=0){
            int i = len1>=0?num1.charAt(len1)-'0':0;     //防止哪一个数字短  加零
            int j = len2>=0?num2.charAt(len2)-'0':0;
            int tmp = i+j+carry;
            carry = tmp/10;
            sB.append(tmp%10);
            len1--;
            len2--;
        }
        if(carry==1) sB.append(1);
        return sB.reverse().toString();
    }
}
