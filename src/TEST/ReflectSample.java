package TEST;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/24 20:32
 */
public class ReflectSample {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //反射
        Class rc = Class.forName("TEST.Robot");
        System.out.println(rc.getClassLoader());

        Robot r = (Robot)rc.newInstance();
        System.out.println("Class name is "+rc.getName());
        Method getHello = rc.getDeclaredMethod("throwHello", String.class);  //私有方法
        getHello.setAccessible(true);
        Object str = getHello.invoke(r,"Bob");
        System.out.println("getHello result is "+str);
        Method sayHi = rc.getMethod("sayHi", String.class);
        sayHi.invoke(r,"Welcome");
        Field name = rc.getDeclaredField("name");
        name.setAccessible(true);
        name.set(r,"linzhu");
        sayHi.invoke(r,"welcome");
    }
}
