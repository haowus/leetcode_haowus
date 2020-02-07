package algorithms;

public class fibnacci {
    public static int fib(int N){

        if(N==0 || N==1)
            return N;
        int i=2;
        int[] nums = new int[N+1];
        nums[0] = 0;
        nums[1] = 1;
        while (i<=N){
            nums[i] = nums[i-1] + nums[i-2];
            i++;
        }
        return nums[N];
    }

    public static void main(String[] args) {
        System.out.println(fib(3));
    }
}
