package algorithms.array.medium;

/**
 * Pow(x,n)
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/15 21:13
 */
public class question_50 {
    public double myPow(double x, int n) {

//        if (n==0) return 1.0;
//        if (n==1) return x;
//        if (n<0) return 1/myPow(x,-n);
//
//        if (n%2==0)
//            return myPow(x,n/2) * myPow(x,n/2);
//        else
//            return myPow(x,n/2) * myPow(x,n/2) * x;

        double res = 1.0;
        for (int i=n;i!=0;i /=2){
            if (i%2 != 0)
                res *= x;
            x *= x;
        }
        return n<0?1/res:res;
    }

    public static void main(String[] args) {
        System.out.println(5%2);
        System.out.println(-2%2);
    }
}
