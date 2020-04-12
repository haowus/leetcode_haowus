package sword_finger_offer;

public class fibonacci {

    public int Fibonacci(int n) {

        if (n==0||n==1)
            return n;
        int[] array = new int[n+1];
        array[0]=0;
        array[1]=1;
        int i=2;
        while (i<=n){
            array[i] = array[i-1]+array[i-2];
            i++;
        }
        return array[n];

    }
}
