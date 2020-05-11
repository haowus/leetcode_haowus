package algorithms.array.easy;

public class oneByte {
    public boolean isOneBitCharacter(int[] bits) {

        int start=0;
        while (start<bits.length-1){
            if (bits[start]==0)
                start++;
            else if (bits[start]==1)
                start+=2;

        }
        return start==bits.length-1;
    }
}
