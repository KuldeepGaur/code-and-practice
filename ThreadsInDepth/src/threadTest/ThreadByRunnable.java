package threadTest;

/**
 * Created by amit on 16/5/17.
 */
public class ThreadByRunnable implements Runnable{
    public void run(){
        for (int i =0;i<100000;i++){
            if(i%777==0){
                System.out.println(i/700 +" FROM "+Thread.currentThread().getName()+" with thread priority "+Thread.currentThread().getPriority() );
            }
        }
    }

    public void testThreadStartFromMethod(){
        System.out.println("hi this is other method from where thread is going to be started let's chcek this");
        Thread.currentThread().start();
    }
}
