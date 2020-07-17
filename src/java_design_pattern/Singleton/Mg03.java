package java_design_pattern.Singleton;

/**
 * 懒汉式 加synchronized，线程安全，但是效率下降
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/17 17:00
 */
public class Mg03 {
    private Mg03(){}
    private static Mg03 INSTANCE;
    public static synchronized Mg03 getInstance(){
        if (INSTANCE==null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mg03();
        }
        return INSTANCE;
    }
}
