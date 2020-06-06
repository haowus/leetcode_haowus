package experience.大华;

/**
 * 一到一亿之间的数字相加（大华1面）  思想：多线程分段求和
 * @author haowus919@gmail.com
 * @date 2020/6/6 14:41
 */

//记录各线程的和
class A{
    long value;
    A(long value){
        this.value = value;
    }
}


public class MultiSum implements Runnable{

    private A sum;
    private long fromInt;
    private long toInt;
    private int ThreadNo;

    private MultiSum(A sum, long fromInt, long toInt, int threadNo) {
        this.sum = sum;
        this.fromInt = fromInt;
        this.toInt = toInt;
        ThreadNo = threadNo;
    }

    @Override
    public void run() {
        long currentTime = System.currentTimeMillis();

        for (long i = fromInt; i <= toInt; i++)
            this.sum.value += i;

        System.out.println("Thread." + ThreadNo + " executes sum from "
                + fromInt + " to " + toInt + " in " + currentTime
                + " milseconds. Sum is " + sum.value);

    }


    public static void main(String[] args) throws InterruptedException {
        long toMax = 100000000;
        long sum = 0;
        int thread_number = 100;
        A[] subSum = new A[thread_number];//创建一个数组用于存储每个线程的求和
        for (int i=0;i<thread_number;i++){
            subSum[i] = new A(0);
        }
        for (int i=0;i<thread_number;i++){
            long fromInt = toMax*i/thread_number+1;
            long toInt = toMax*(i+1) /thread_number;
//            System.out.println(fromInt+"--"+toInt);
            new Thread(new MultiSum(subSum[i],fromInt,toInt,i)).start();
        }
        Thread.sleep(100);
        for (int i=0;i<thread_number;i++)
            sum += subSum[i].value;
        System.out.println("1~1亿的和为：" + sum);
    }
}
