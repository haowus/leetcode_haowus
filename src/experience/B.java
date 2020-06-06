package experience;

public class B {
    int bb=0;
    static int bbb=1;
    public static class C{
        public static int a=10;
        public int b = 20;
        public static int read(int q){
            return q;
        }
        public int wr(int v){
            return v;
        }

        public static void main(String[] args) {
            B b = new B();

        }
    }

    public class D{

        public int b = 20;

    }

    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        c.wr(2);
        B.C dd= new C();
        B.D d = b.new D();
    }


}

