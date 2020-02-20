package algorithms.string.easy;

public class frequencyStr {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {

        int [] ans = new int[queries.length];
        for (int i=0;i<queries.length;i++){
            int count = 0;
            for (int j=0;j<words.length;j++){
                if (freq(queries[i])<freq(words[j])){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;

    }
    public int freq(String s){
        char[] chars = s.toCharArray();
        int[] fre = new int[26];
        for (char ch:chars)
            fre[ch-'a']++;
        for (int i=0;i<fre.length;i++){
            if (fre[i]!=0)
                return fre[i];
        }
        return 0;
    }
}
