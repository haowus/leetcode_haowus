package TEST;

/**
 * @author haowus919@gmail.com in dormitory
 * @date 2020/7/5 17:00
 */
public interface ThreadPool<Job extends Runnable> {
    /**
     * 线程池开始
     */
    void execute(Job job);
    /**
     * 关闭线程池
     */
    void shutDown();
    /**
     * 添加线程
     * @param num
     */
    void addWorkers(int num);
    /**
     * 减少线程
     * @param num
     */
    void removeWorker(int num);
    /**
     * 获取正在等待的线程数量
     * @return
     */
    int getJobSize();
}
