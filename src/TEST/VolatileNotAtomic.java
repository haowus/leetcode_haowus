package TEST;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author haowus919@gmail.com in lab
 * @Date 2020/7/22 18:18
 */
public class VolatileNotAtomic {
    private static volatile long count=0;
    private static final int NUMBER = 10000;


    public static void main(String[] args) {
        Thread substractThread = new SubstractThread();
        substractThread.start();
        synchronized (VolatileNotAtomic.class){
            for (int i=0;i<NUMBER;i++)
                count++;
        }


        while (substractThread.isAlive()){

        }
        System.out.println("count最后的值为："+count);
    }

    private static class SubstractThread extends Thread{
        @Override
        public void run(){
            synchronized (VolatileNotAtomic.class){
                for (int i=0;i<NUMBER;i++)
                    count--;
            }

        }
    }
}
