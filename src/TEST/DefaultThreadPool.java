package TEST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author haowus919@gmail.com in dormitory
 * @date 2020/7/5 17:02
 */
public class DefaultThreadPool<Job extends Runnable> implements ThreadPool<Job> {

    private static final int MAX_WORKER_NUMBERS = 10;

    private static final int DEFAULT_WORKERS_NUMBERS = 2 * (Runtime.getRuntime().availableProcessors()) + 1;

    private static final int MIN_WORDER_NUMBERS = 1;

    private final LinkedList<Job> jobs = new LinkedList<Job>();

    //管理工作线程的集合
    private final List<Worker> workers = Collections.synchronizedList(new ArrayList<Worker>());

    private int workerNum = DEFAULT_WORKERS_NUMBERS;

    private AtomicLong threadNum = new AtomicLong();

    /**
     * 线程开始运行
     */
    public DefaultThreadPool() {

        initWorkers(DEFAULT_WORKERS_NUMBERS);
    }

    public DefaultThreadPool(int num) {

        workerNum = num > MAX_WORKER_NUMBERS ? MAX_WORKER_NUMBERS : num < MIN_WORDER_NUMBERS ? MIN_WORDER_NUMBERS : num;

    }

    /**
     * 初始化线程
     *
     * @param defaultWorkersNumbers
     */
    private void initWorkers(int defaultWorkersNumbers) {
        for (int i = 0; i < defaultWorkersNumbers; i++) {
            Worker worker = new Worker();
            workers.add(worker);
            Thread thread = new Thread(worker, "ThreadPool-worker" + threadNum.incrementAndGet());
            thread.start();
        }

    }

    /**
     * 执行任务
     *
     * @param job
     */
    @Override
    public void execute(Job job) {
        if (job != null) {
            synchronized (jobs) {
                jobs.addLast(job);
                jobs.notify();
            }
        }
    }

    /**
     * 关闭线程
     */
    @Override
    public void shutDown() {
        for (Worker worker : workers) {
            if (worker != null) {
                worker.shutDown();
            }
        }
    }

    /**
     * 添加线程
     *
     * @param num
     */
    @Override
    public void addWorkers(int num) {
        synchronized (jobs) {
            if (num + this.workerNum > MAX_WORKER_NUMBERS) {
                num = MAX_WORKER_NUMBERS - this.workerNum;
            }
            initWorkers(num);
            this.workerNum += num;
        }

    }

    /**
     * 移除线程
     *
     * @param num
     */
    @Override
    public void removeWorker(int num) {
        synchronized (jobs) {
            if (num > workerNum) {
                throw new IllegalArgumentException("much workNum");
            }
            int count = 0;
            while (count < num) {
                Worker worker = workers.get(count);
                if (workers.remove(worker)) {
                    worker.shutDown();
                    count++;
                }
            }
            this.workerNum -= count;
        }
    }

    /**
     * 获取工作线程的数量
     *
     * @return
     */
    @Override
    public int getJobSize() {

        return jobs.size();
    }

    /**
     * 工作线程
     */
    public class Worker implements Runnable {

        private volatile boolean running = false;

        @Override
        public void run() {
            while (running) {
                Job job = null;
                synchronized (jobs) {
                    while (jobs.isEmpty()) {
                        try {
                            jobs.wait();
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    job = jobs.removeFirst();
                }
                if (job != null) {
                    try {
                        job.run();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }

        public void shutDown() {
            this.running = false;
        }
    }
}