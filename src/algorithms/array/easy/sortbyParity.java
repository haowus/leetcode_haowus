package algorithms.array.easy;

public class sortbyParity {
    public int[] sortArrayByParity(int[] A) {

        int len = A.length,t=0;
        int[] ans = new int[A.length];
        for (int i=0;i<A.length;i++){
            if (A[i]%2==0)
                ans[t++]=A[i];
            else
                ans[--len]=A[i];
        }
        return ans;
    }
}
