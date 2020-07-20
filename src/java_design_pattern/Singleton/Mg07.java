package java_design_pattern.Singleton;

/**
 * 枚举单例
 * 不仅可以解决线程同步，还可以防止反序列化(因为枚举类没有构造方法)
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/17 19:35
 */
public enum Mg07 {
    INSTANCE
}
