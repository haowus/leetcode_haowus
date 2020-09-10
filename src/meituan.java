import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/9/6 11:08
 */
public class meituan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine();
        int [] nums = new int[n+1];
        for (int i =0; i<p; i++)
            nums[sc.nextInt()] +=1;
        for (int i =0; i<q;i++)
            nums[sc.nextInt()] +=2;
        int numA = 0, numB=0, numAB= 0;
        for (int i=1;i<=n;i++){
            if (nums[i] ==1)
                numA++;
            else if (nums[i]==2)
                numB++;
            else if (nums[i] ==3)
                numAB++;
        }
        System.out.println(numA +" " + numB +" "+ numAB);
    }
}
