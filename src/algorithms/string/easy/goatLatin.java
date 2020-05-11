package algorithms.string.easy;

public class goatLatin {
    public String toGoatLatin(String S) {

        String[] words = S.split(" ");
        String vowel = "aeiouAEIOU";
        for (int i=0;i<words.length;i++){
            char[] chars = words[i].toCharArray();
            if (vowel.contains(String.valueOf(chars[0])))
                words[i] += "ma";
            else {
                words[i] = words[i].substring(1,words[i].length())+chars[0]+"ma";
            }
            for (int j=0;j<i+1;j++)
                words[i]+="a";
        }
        StringBuilder sb = new StringBuilder();
        for (String s :words)
            sb.append(s+" ");
        return sb.substring(0,sb.toString().length()-1);
    }
}
