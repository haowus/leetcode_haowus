import javax.management.Query;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class test {
    public static void main(String[] args) throws Exception {
//        String str = "成都市(成华区)(武侯区)(高新区)";
//        Pattern p = Pattern.compile(".*?(?=\\()");
//        Matcher m = p.matcher(str);
//        if(m.find()) {
//            System.out.println(m.group());
//        }

//        Integer a = new Integer(3);
//        Integer b = 3;
//        int c=3;
//        System.out.println(a==b);
//        System.out.println(a==c);   //Integer自动拆箱成int 与c比较
//        System.out.println(b==c);
//        System.out.println(translate("2r3hsaf^^%@.;kdfd"));

//        System.out.println(4.0-3.6);
//        int a =  3;
//        int b = 3;
//        System.out.println(a == b);
//        String s = "hello";
//
//        Method m = s.getClass().getMethod("toUpperCase");
//
//        System.out.println(m.invoke(s));
        Integer a = new Integer(2);
        Integer b = new Integer(2);
        String s1 = new String();
        String s2 = "123";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));
        System.out.println(a==b);


    }
    public static String translate (String str) {
        String tempStr = "";
        try {
            tempStr = new String(str.getBytes("ISO-8859-1"),"GBK");
            tempStr = tempStr.trim();
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return tempStr;
    }
}