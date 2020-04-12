package experience;

//
//class Person{
//    String name = "no name";
//    public Person(String nm){
//        name = nm;
//    }
//}
//class Employee extends Person{
//    String empID = "0000";
//    public Employee(String id){
//        super("nm");
//        empID = id;
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        Employee e = new Employee("123");
//        System.out.println(e.empID);
//    }
//
//
//}

//public class Test {
//
//    public static int a = 1;
//
//    public static void main(String[] args) {
//
//        int a = 10;
//
//        a++;
//
//        Test.a++;
//
//        Test t=new Test();
//
//        System.out.println("a=" + a + " t.a=" + t.a + " Test.a=" + Test.a);
//
//    }
//
//}
//class Father {
//    public void say(){
//        System.out.println("father");
//    }
//    public static void action(){
//        System.out.println("爸爸打儿子！");
//    }
//}
//class Son extends Father{
//    public void say() {
//        System.out.println("son");
//    }
//    public static void action(){
//        System.out.println("打打！");
//    }
//}
//class Test{
//    public static void main(String[] args) {
//        Father f=new Son();
//        f.say();
//        f.action();
//    }
//}
//class Test{
//static int i;
//public static void main(String argv[]) {
//    System.out.println(i);
//}
//}
//class A {
//
//    public int i;
//
//    static String s;
//
//    void method1(){}
//
//    static void method2(){}
//
//    public A(int a,String st){
//        i = a;
//        s = st;
//    }
//
//}

//class Test{
//    public static void main(String[] args) {
//        A a = new A(1,"www");
//        a.method1();
//        A.method2();
//
//
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        Test inc = new Test();
//        int i = 0;
//        inc.fermin(i);
//        i= i ++;
//        System.out.println(i);
//
//    }
//    void fermin(int i){
//        i++;
//    }
//}

//class Test {
//    private int data;
//    int result = 0;
//    public void m() {
//        result += 2;
//        data += 2;
//        System.out.print(result + "  " + data);
//    }
//}
//class ThreadExample extends Thread
//{
//    private Test mv;
//    public ThreadExample(Test mv)
//    {
//        this.mv = mv;
//    }
//    public void run()
//    {
//        synchronized(mv)
//        {
//            mv.m();
//        }
//    }
//}
//class ThreadTest
//{
//    public static void main(String args[])
//    {
//        Test mv = new Test();
//        Thread t1 = new ThreadExample(mv);
//        Thread t2 = new ThreadExample(mv);
//        Thread t3 = new ThreadExample(mv);
//        t1.start();
//        t2.start();
//        t3.start();
//    }
//}

public class Test{
//    static boolean out(char c){
//        System.out.println(c);
//        return true;
//    }
//    public static void main(String[] argv){
//        int i = 0;
//        for(out('A');out('B') && (i<2);out('C')){
//            i++;
//            out('D');
//        }
//    }
public int solution (int n) {
    int n1 = n;
    String k = "";
    if(n<=9){
        return 10+n;
    }
    for(int i=9;i>=2;){
        if(n1%i==0){
            k += i;
            n1=n1/i;
            continue;
        }
        else
            i--;
    }
    int n2=1;
    for(int i=0;i<k.length();i++){
        n2=n2*Integer.parseInt(String.valueOf(k.charAt(i)));
    }
    if(n2==n){
        String temp="";
        for(int i=k.length()-1;i>=0;i--){
            temp+=k.charAt(i);
        }
        return Integer.parseInt(temp);
    }
    else
        return -1;

}
public static void main(String[] args) {
    System.out.println("-------continue测试----------");
    for (int i = 0; i < 5; i++) {
        if (i == 2) {
            System.out.println("跳过下面输出语句，返回for循环");
            continue;
        }

        System.out.println(i);
    }
}
}