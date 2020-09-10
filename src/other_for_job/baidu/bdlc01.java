package other_for_job.baidu;

import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in lab
 * @Date 2020/9/3 19:51
 */
public class bdlc01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x0 = sc.nextInt();
        int y0 = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        char[] chars = s.toCharArray();

        for(int i=0;i<chars.length;i++){

            if(chars[i]=='L'){
                y0-=1;
            }
            if(chars[i]=='D'){
                x0+=1;
            }
            if(chars[i]=='U'){
                x0-=1;
            }
            if(chars[i]=='R'){
                y0+=1;
            }
        }
        System.out.println(x0+" "+y0);
    }
}
