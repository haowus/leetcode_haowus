package java_design_pattern;

import java_design_pattern.Singleton.Mg05;
import java_design_pattern.Singleton.Mg07;

/**
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/17 16:34
 */
public class Test {
    public static void main(String[] args) {

//        for(int i=0;i<100;i++){
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//
//                    System.out.println(Mg01.getINSTANCE().hashCode());
//                }
//            }).start();
//        }
        for(int i=0;i<1000;i++){
            new Thread(()->{
                System.out.println(Mg05.getInstance().hashCode());
            }).start();
        }
    }
}
