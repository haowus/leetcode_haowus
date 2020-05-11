package sword_finger_offer;

public class uglyNumber {
    public int GetUglyNumber_Solution(int index) {
        if (index<0) return 0;
        int[] uglyArr = new int[index];
        uglyArr[0] = 1;
        int p2=0,p3=0,p5=0;
        for (int i=1;i<index;i++){
            int lastMaxUgly = uglyArr[i-1];
            while (lastMaxUgly>=uglyArr[p2]*2) p2++;
            while (lastMaxUgly>=uglyArr[p3]*3) p3++;
            while (lastMaxUgly>=uglyArr[p5]*5) p5++;
            uglyArr[i] = Math.min(Math.min(uglyArr[p2]*2,uglyArr[p3]*3),uglyArr[p5]*5);
        }
        return uglyArr[index-1];
    }

    public static void main(String[] args) {
        System.out.println(new uglyNumber().GetUglyNumber_Solution(5));
    }
}
