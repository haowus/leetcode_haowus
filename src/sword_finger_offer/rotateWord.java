package sword_finger_offer;

public class rotateWord {
    public static void main(String[] args) {
        rotateWord rw = new rotateWord();
        String s = rw.ReverseSentence("student. a am I");
        System.out.println(s);
    }
    public String ReverseSentence(String str) {

        if (str==null || str.trim().length()==0) return str;

        String s = new StringBuffer(str).reverse().toString();
        char[] ch = s.toCharArray();
        int l,r=0;
        while (r<ch.length){
            l = r;
            while (ch[l] == ' ') l++;
            r = l;   //r 和 l在新一次的翻转中国， 位于同一个位置
            while (r<ch.length && ch[r] !=' ') r++;
            reverse(ch,l,r-1);
        }
        return String.valueOf(ch);
    }

    private void reverse(char[] ch,int l,int r){
        while (l<r){
            char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;
            l++;
            r--;
        }
    }
}
