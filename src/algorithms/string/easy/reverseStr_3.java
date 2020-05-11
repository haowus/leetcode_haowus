package algorithms.string.easy;

public class reverseStr_3 {
    public String reverseWords(String s) {

        StringBuilder sb =new StringBuilder();
        String[] strings = s.trim().split(" ");
        for (int i=0;i<strings.length;i++){
            String ans = "";
            for (int j=strings[i].length()-1;j>=0;j--){
                ans += strings[i].charAt(j);
            }
            if(i==strings.length-1) sb.append(ans);
            else
                sb.append(ans+" ");
        }
        return sb.toString();
    }
}
