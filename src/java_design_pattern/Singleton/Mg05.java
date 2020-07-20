package java_design_pattern.Singleton;

/**
 * 懒汉式 双重检查
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/17 19:25
 */
public class Mg05 {
    private Mg05(){}
    private static volatile Mg05 INSTANCE;   //防止指令重排
    public static Mg05 getInstance(){
        if (INSTANCE==null){

            //双重检查
            synchronized (Mg05.class){
                if (INSTANCE==null){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mg05();
                }

            }
        }
        return INSTANCE;
    }
}
