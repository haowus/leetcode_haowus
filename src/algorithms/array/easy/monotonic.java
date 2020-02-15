package algorithms.array.easy;

public class monotonic {
    public boolean isMonotonic(int[] A) {
        int countUP=0,countDOWN=0,count0=0;
        for(int i=0;i<A.length-1;i++){
            if(A[i+1]<A[i])
                countDOWN++;
            else if (A[i+1]>A[i])
                countUP++;
            else
                count0++;
        }

        return (count0+countUP==A.length-1||count0+countDOWN==A.length-1) ?true:false;
    }
}
