package java_design_pattern.Singleton;

/**
 * 懒汉式  按需初始化，但是可能会带来线程不安全问题
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/17 16:47
 */
public class Mg02 {
    private Mg02(){}
    private static Mg02 INSTANCE;    //没有加final, 因为final要初始化
    public static Mg02 getInstance(){

        if (INSTANCE==null){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mg02();
        }

        return INSTANCE;
    }
}
