package sword_finger_offer;

import java.util.Arrays;

public class notrepeatFirst {
    public int FirstNotRepeatingChar(String str) {

        char[] charStr = str.toCharArray();
        int [] arr = new int[128];
        Arrays.fill(arr,0);
        for(char c:charStr)
            arr[c]++;

        for (int i=0;i<charStr.length;i++)
            if (arr[charStr[i]] == 1)
                return i;


        return -1;
    }

    public static void main(String[] args) {
        notrepeatFirst nf = new notrepeatFirst();
        System.out.println(nf.FirstNotRepeatingChar("google"));
    }
}
