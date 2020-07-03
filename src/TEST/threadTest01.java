package TEST;

/**
 * @author haowus919@gmail.com in dormitory
 * @date 2020/6/30 11:40
 */
public class threadTest01 {
    //创建线程
    public static void main(String[] args) throws InterruptedException {
        Thread thread= new Thread(new Runnable(){
            public void run() {
                try {
                    System.out.println("thread: "+Thread.currentThread().getName());
                    System.out.println("child thread is sleep");
                    Thread.sleep(10000);
                    System.out.println("child thread is in awaked");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        System.out.println("current: "+Thread.currentThread().getName());
        //启动线程
        thread.start();
        //主线程休眠2s
        Thread.sleep(2000);
        //主线程中断子线程
        thread.interrupt();
        ThreadLocal<String> local = new ThreadLocal<>();
        local.set("sss");
        local.remove();
        System.out.println(local.get());

    }

}
