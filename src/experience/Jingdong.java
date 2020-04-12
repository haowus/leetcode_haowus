package experience;

import java.util.*;
public class Jingdong {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("请输入一个正整数：");
        int k=fun(getString());
        System.out.println("输出最小正整数："+k);
    }
    public static Integer getString(){
        return Integer.parseInt((new Scanner(System.in)).nextLine());
    }
    public static int fun(int n1){
        int n=n1;String k="";
        if(n<=9){
            return 10+n;
        }
        for(int i=9;i>=2;){
            if(n%i==0){
                k+=i;
                n=n/i;
                continue;
            }else
                i--;
        }
        int j=0;int n2=1;
        while(j<k.length()){
            n2=n2*Integer.parseInt(k.charAt(j)+"");
            j++;
        }
        if(n2!=n1){
            return -1;
        }
        String temp="";
        for(int i=k.length()-1;i>=0;i--){
            temp+=k.charAt(i);
        }
        return Integer.parseInt(temp);
    }
}

