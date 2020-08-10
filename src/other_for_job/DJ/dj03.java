package other_for_job.DJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/10 19:39
 */
public class dj03 {


    public static void main(String[] args) {


//        char[][] alpha = new char[][]{{'a','t','m','b'},{'f','u','e','g'},
//                {'l','y','i','n'},{'p','k','j','d'}};
//
//        int rows = alpha.length;
//        int cols = alpha[0].length;
//        int[][] visited = new int[rows][cols];
//        String[] exam = new String[]{"dji", "drone", "flying", "ideas"};
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        char[][] alpha = new char[rows][];

        int max = 0;
        for (int i=0;i<rows;i++){
            char[] colStr=sc.next().toCharArray();
            max = Math.max(colStr.length,max);
            alpha[i] = colStr;
        }
//        for (int i=0;i<rows;i++)
//            for (int j=0;j<alpha[i].length;j++)
//                System.out.println(i+","+j+":"+alpha[i][j]);

        char[][] alpha_fin = new char[rows][max];
        for (int i=0;i<rows;i++)
            for (int j =0;j<max;j++){
                if (j<alpha[i].length)
                    alpha_fin[i][j] = alpha[i][j];
            }



        int number = sc.nextInt();
        String[] exam = new String[number];
        for (int i=0;i<exam.length;i++)
            exam[i] = sc.next();


        List<String> res = new ArrayList<>();
        for (int k=0;k<exam.length;k++){
            int[][] visited = new int[rows][max];
            for (int i=0;i<rows;i++){
                for (int j=0;j<max;j++){
                    if (path(alpha_fin,exam[k],i,j,rows,max,0,visited))
                        res.add(exam[k]);
                }
            }
        }
        Collections.sort(res);

        System.out.println(res);
    }
    private static boolean path(char[][] alpha,String word,int x,int y,int rows,int cols,int index,int[][] visited){


        if (x>=rows || x<0 || y>=cols||y<0 )
            return false;
        if (alpha[x][y]!=word.charAt(index) || visited[x][y]==1)
            return false;

        if (index==word.length()-1) return true;
        visited[x][y] = 1;

        if (path(alpha, word, x - 1, y, rows, cols, index + 1, visited) || path(alpha, word, x + 1, y, rows, cols, index + 1, visited) ||
                path(alpha, word, x, y - 1, rows, cols, index + 1, visited) || path(alpha, word, x, y + 1, rows, cols, index + 1, visited))
            return true;
        else
            visited[x][y]=0;
        return false;


    }
}
