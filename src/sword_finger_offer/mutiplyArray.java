package sword_finger_offer;

public class mutiplyArray {
    public int[] multiply(int[] A) {


        int [] B = new int[A.length];
        int mul = 1;
        for (int i = 1;i<B.length-1;i++){
            for (int j=0;j<A.length;j++){
                if (j==i) continue;
                mul *= A[j];
            }
            B[i] = mul;
        }
        int mul0 = 1,muln=1;
        for (int i=1;i<A.length;i++)
            mul0 *= A[i];
        for (int i=0;i<A.length-1;i++)
            muln *= A[i];
        B[0] = mul0;
        B[B.length-1] = muln;

        return B;
    }

    public static void main(String[] args) {
        mutiplyArray ma = new mutiplyArray();
        System.out.println(ma.multiply(new int[]{1,2,3,4,5}));
    }
}
