package java_design_pattern.Singleton;

/**
 * 懒汉式
 * 静态内部类方式
 * JVM保证单例
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/17 19:29
 */
public class Mg06 {
    private Mg06(){}
    private static class Mg06Holder{
        private static final Mg06 INSTANCE= new Mg06();
    }
    private static Mg06 getInstance(){
        return Mg06Holder.INSTANCE;
    }
}
