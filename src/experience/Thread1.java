package experience;

public class Thread1 {
    public static void main(String[] args) {
        Thread_test tt = new Thread_test();
//        tt.start();    //通过继承Thread类创建线程，直接调用start()方法
        Thread thread = new Thread(tt);
        thread.start();    //实现Runnable接口，

        for (int i=0;i<100;i++)
            System.out.println("Main Thread: "+i);
    }



}

//class Thread_test extends Thread{ //定义一个Thread的子类继承继承Thread类，重写run()方法，然后生成该子类的对象
class Thread_test implements Runnable{ //定义线程类实现Runnable接口（推荐）
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("Thread_test: "+i);
        }
    }
}
