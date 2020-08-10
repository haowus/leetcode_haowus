package TEST;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;
import java.util.concurrent.*;

/**
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/22 19:01
 */
public class Test {
    private static Object String;
    private int a = 1;
    private boolean isTrue = false;
    byte[] b = new byte[1024*100];
    public static void main(String[] args) throws InterruptedException, ClassNotFoundException {
//        String s = "wuhao";
//        int hashcode = s.hashCode();
//        System.out.println(hashcode);  //113487608   110110000111010111011111000
//        int hash = hashcode ^ (hashcode >>>16);
//        System.out.println(hash);    //1731    11011000011
//        int slot = hash & (16-1);
//        System.out.println(slot);   //3   0011
        
//        List<Object> objectList;
//        List<String> stringList = new LinkedList<>();
//        List<String> rawList = new ArrayList();
//        List<Integer> o1 = null;
//        List<? extends Number> o;  //Integer 继承自 Number
//        o = o1;    //  ? extends Number  可接受继承自Number的类型，  Number是上界
//        List<? super Integer> o2;
//        List<Number> o22 = null;
//        o2 = o22;   //  ? super Integer  可接受Integer的父类的类型   Integer是下界
//
//        Class s1 = Test.class;
//        Class s2 = String.class;
////        Class cls = new Class(String);
//        String s = "Hello";
//        Class cls = s.getClass();
//
//        System.out.println(s1+"--"+s2+"--"+cls);

        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println(method);
                if (method.getName().equals("morning")){
                    System.out.println("good morning, "+args[0]);
                }
                return null;
            }
        };

        //创建接口实例
        Hello hello = (Hello) Proxy.newProxyInstance(
                Hello.class.getClassLoader(),
                new Class[]{Hello.class},
                handler
        );
        hello.morning("bob");


    }
}
interface Hello{
    void morning(String name);
}
interface Hi{
    void morning(String name);
}