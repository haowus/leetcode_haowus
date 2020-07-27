package TEST;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/26 20:39
 */
public class Reflect_test {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("TEST.Reflect_test");  //获取类的class对象实例
        Constructor constructor = cls.getConstructor();  //获得构造器
        Object obj = constructor.newInstance();    //获取反射类对象
        Method set = cls.getMethod("setPrice", int.class);  //获取setPrice方法的Method对象
        set.invoke(obj,14);
        System.out.println(cls.getMethod("getPrice").invoke(obj));
    }
}
