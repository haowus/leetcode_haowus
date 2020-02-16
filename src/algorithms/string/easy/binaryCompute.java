package algorithms.string.easy;

import java.util.Map;

public class binaryCompute {
    public String addBinary(String a, String b) {

        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
        //radix:表明前面的数是什么进制;
    }
}
