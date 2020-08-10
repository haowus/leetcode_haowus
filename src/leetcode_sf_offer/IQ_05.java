package leetcode_sf_offer;

/**
 * 面试题05. 替换空格
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/17 20:27
 */
public class IQ_05 {
    public String replaceSpace(String s) {

        if (s==null || s.length()==0) return "";
        int blank = 0;
        for (int i=0;i<s.length();i++)
            if (s.charAt(i)==' ')
                blank++;

        int newStrLen = s.length()+blank*2;
        char[] newStr = new char[newStrLen];
        int p1=s.length()-1,p2=newStrLen-1;
        while (p1!=p2){
            char ch = s.charAt(p1);
            if (ch!=' '){
                newStr[p2]=ch;
                p1--;
                p2--;
            }else {
                newStr[p2--]='0';
                newStr[p2--]='2';
                newStr[p2--]='%';
                p1--;
            }
        }
        while (p1>=0){
            newStr[p2--]=s.charAt(p1--);
        }
        StringBuilder sb = new StringBuilder();
        for (char c:newStr)
            sb.append(c);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new IQ_05().replaceSpace("we are happy."));
    }
}
