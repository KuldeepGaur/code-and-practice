package threadTest;

/**
 * Created by amit on 16/5/17.
 */
public class TestWithMultipleThreadInSequentialManner {
    public static void main(String[] args) {
        ThreadByRunnable threadByRunnable = new ThreadByRunnable();
        Thread t = new Thread(threadByRunnable);
        Thread t1 = new Thread(threadByRunnable);
        Thread t2 = new Thread(threadByRunnable);
        Thread t3 = new Thread(threadByRunnable);
        Thread t4 = new Thread(threadByRunnable);
        Thread t5 = new Thread(threadByRunnable);
        Thread t6 = new Thread(threadByRunnable);
        Thread t7 = new Thread(threadByRunnable);

        t.start();t1.start();t2.start();t3.start();t4.start();t5.start();t6.start();t7.start();

        threadByRunnable.testThreadStartFromMethod();

    }
}
