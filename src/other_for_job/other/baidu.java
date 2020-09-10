package other_for_job.other;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/9/3 18:37
 */
public class baidu {
    public static void main(String[] args) {
//        String a = "abcasfn";
////        String b = "ansf";
////
////        char[] ch_a = a.toCharArray();
////        char[] ch_b = b.toCharArray();
////        Arrays.sort(ch_a);
////        Arrays.sort(ch_b);
////
////        StringBuilder sa = new StringBuilder(a);
////        StringBuilder sb = new StringBuilder(b);
////
////        for (int i=0;i<sb.length();i++){
////
////        }


    }
    private static boolean isFive(int n){

        while (n!=0){
            if (n%10==5){
                return true;
            }
            n/=10;
        }
        return false;
    }
    private static void recursive(){
        recursive();

    }
}
