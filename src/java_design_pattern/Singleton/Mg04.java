package java_design_pattern.Singleton;

/**
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/17 19:23
 */
public class Mg04 {
    private Mg04(){}
    private static Mg04 INSTANCE;
    public static Mg04 getInstance(){
        if (INSTANCE==null){

            //试图通过减小同步代码块的方式提高效率，然而不可行
            synchronized (Mg04.class){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Mg04();
            }

        }
        return INSTANCE;
    }
}
