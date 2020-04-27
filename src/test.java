import javax.management.Query;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//class test {
//    public static void main(String[] args) throws Exception {
//        int n = -1;
//        int count = 0;
//        while(n!=0){
//            count += (n&1);  //按位与
//            n>>>=1;
//        }
//        System.out.println(count);;

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
//        Integer a = new Integer(2);
//        Integer b = new Integer(2);
//        String s1 = new String();
//        String s2 = "123";
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
//        System.out.println(a.equals(b));
//        System.out.println(a==b);
//        Vector vector = new Vector();
//        for (int i=0;i<10;i++)
//            vector.add(i);
//
//        System.out.println(vector);
//        Collection coll = new ArrayList();
//        coll.add("aaa");
//        coll.add(1);
//        coll.add('c');
//        coll.add("ddd");
//        System.out.println(coll);
//        Iterator it = coll.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//            it.remove();
//        }
//        System.out.println(coll);




//    }
//    public static String translate (String str) {
//        String tempStr = "";
//        try {
//            tempStr = new String(str.getBytes("ISO-8859-1"),"GBK");
//            tempStr = tempStr.trim();
//        }
//        catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//        return tempStr;

//    }


//}
class Cache<T> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}

class test{
    public static void main(String[] args) {
        Integer s1 = 1;
        Integer s2 = 1;
        Integer l1 = new Integer(1);
        Integer l2 = new Integer(1);
        System.out.println(s1.hashCode()+" "+s2.hashCode());
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(l1.hashCode()+" "+l2.hashCode());
        System.out.println(l1.equals(l2));
        System.out.println(l1==l2);
    }


}
