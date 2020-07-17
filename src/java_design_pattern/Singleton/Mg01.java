package java_design_pattern.Singleton;

/**
 * 饿汉式
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/17 16:34
 */
public class Mg01 {
    private Mg01(){}  //构造函数
    private static Mg01 INSTANCE = new Mg01();   //创建实例
    public static Mg01 getInstance(){
        return INSTANCE;
    }
}
