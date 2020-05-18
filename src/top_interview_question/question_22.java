package top_interview_question;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class question_22 {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        int l=0,r=0;
        dfs(result,"",n,l,r);
        return result;
    }
    void dfs(List<String> result,String path,int n,int l,int r){
        if (l < r || l > n || r > n)  return ;
        if (l==r&&l==n){
            result.add(path);
            return;
        }
        dfs(result,path+'(',n,l+1,r);
        dfs(result,path+')',n,l,r+1);
    }

    void backtrack(int n,int depth,char[] ch,StringBuilder path,List<String> result) {
        if (depth == 2*n){
            result.add(path.toString());
            return;
        }

        for (int i = 0; i < 2; i++){
            path.append(ch[i]);
            backtrack(n,depth+1,ch,path,result);
            path.deleteCharAt(path.length()-1);
        }
    }
    boolean isValid(String path){
        Stack<Character> stack = new Stack<>();
        for(char c:path.toCharArray()){
            if(c== '(')
                stack.push(')');
            else if(stack.isEmpty() || c != stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        question_22 q22 = new question_22();
//        q22.generateParenthesis(3);
        List<String> result = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        char[] ch = new char[]{'(',')'};
        q22.backtrack(3,0,ch,path,result);
        System.out.println(result);
        for (int k=0;k<result.size();k++){
            if (q22.isValid(result.get(k)))
                System.out.println(result.get(k));

        }
    }
}
