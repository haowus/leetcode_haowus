package other_for_job;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/9/5 19:24
 */
public class sougou03 {
    public static void main(String[] args) {
        System.out.println(getPasswordCount("123"));
    }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 返回生成的新密码个数
     * @param password string字符串 密码的数组字符串（长度小于50），例如 12345
     * @return long长整型
     */
    public static long getPasswordCount (String password) {
        // write code here
        char[] chars = password.toCharArray();

        return countnum(chars);
    }
    private static long countnum(char[] arr){
        int len = arr.length;
        StringBuilder sb =new StringBuilder();
        Set<String> set = new HashSet<>();
        for (int i=0;i<=9;i++){
            sb.append(i);
            dfs(sb,i,len,set,1,arr);
            sb.delete(0,sb.length());
        }
        if (arr[0]=='0')
            return set.size();
        return set.size()-1;
    }

    private static void dfs(StringBuilder sb, int i, int len, Set<String> set, int bit, char[] arr) {

        if (sb.length()==len){
            set.add(sb.toString());
            return;
        }
        double x = ((arr[bit]-'0')+i)/2.0;
        if ((int)x ==x){
            int a =(int)x;
            sb.append(a);
            dfs(sb,a,len,set,bit+1,arr);
            sb.deleteCharAt(sb.length()-1);
        }else {
            int b=(int)Math.ceil(x);
            int c =(int)Math.floor(x);
            sb.append(b);
            dfs(sb,b,len,set,bit+1,arr);
            sb.deleteCharAt(sb.length()-1);
            sb.append(c);
            dfs(sb,c,len,set,bit+1,arr);
            sb.deleteCharAt(sb.length()-1);

        }
    }
}
