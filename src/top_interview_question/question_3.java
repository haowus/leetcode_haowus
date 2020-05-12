package top_interview_question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class question_3 {
    public static int lengthOfLongestSubstring(String s) {

        if (s==null || s.length()==0) return 0;
        if (s.length()==1) return 1;
        int count=0;
        ArrayList<Character> res = new ArrayList<>();
        for (int i=0;i<s.length();i++){

            for (int j=i;j<s.length();j++){
                if (!res.contains(s.charAt(j)))
                    res.add(s.charAt(j));
                else {
                    break;
                }
            }
            count = Math.max(count,res.size());
            //当count大于等于剩下字符串的长度时，不再遍历
            if (count >= s.length() - 1 - i) {
                break;
            }
            res.clear();
        }

        return count;

        //答案
        // 哈希集合，记录每个字符是否出现过
//        Set<Character> occ = new HashSet<Character>();
//        int n = s.length();
//        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
//        int rk = -1, ans = 0;
//        for (int i = 0; i < n; ++i) {
//            if (i != 0) {
//                // 左指针向右移动一格，移除一个字符
//                occ.remove(s.charAt(i - 1));
//            }
//            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
//                // 不断地移动右指针
//                occ.add(s.charAt(rk + 1));
//                ++rk;
//            }
//            // 第 i 到 rk 个字符是一个极长的无重复字符子串
//            ans = Math.max(ans, rk - i + 1);
//        }
//        return ans;

//        作者：LeetCode-Solution
//        链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/solution/wu-zhong-fu-zi-fu-de-zui-chang-zi-chuan-by-leetc-2/
//        来源：力扣（LeetCode）
//        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。




    }



    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("au"));
    }
}
