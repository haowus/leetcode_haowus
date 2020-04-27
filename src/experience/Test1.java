package experience;

//public class test_1 {
//    public static void main(String[] args) {
//        stu s = new stu();
//        s.method();
//    }
//
//}
//
//class person{
//    private int a = 1;
//    int b= 2;
//}
//class stu extends person{
//    void method(){
//        System.out.println(b);
//    }
//}

class Test1 {
    private int data;
    int result =0;
    public void m()
    {
        result += 2;
        data += 2;
        System.out.print(result + "  " + data);
    }
}
class ThreadExample extends Thread
{
    private Test1 mv;
    public ThreadExample(Test1 mv)
    {
        this.mv = mv;
    }
    public void run()
    {
        synchronized(mv)
        {
            mv.m();
        }
    }
}
class ThreadTest {
    public static void main(String args[]) {
        Test1 mv = new Test1();
        Thread t1 = new ThreadExample(mv);
        Thread t2 = new ThreadExample(mv);
        Thread t3 = new ThreadExample(mv);
        t1.start();
        t2.start();
        t3.start();
        int[] a = {1,2,3};
    }
}
