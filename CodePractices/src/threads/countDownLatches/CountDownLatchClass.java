package countDownLatches;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * countdownlatch is the class in java by default which is extremely helpful in the synchronized manner
 *  
 */

class Processor implements Runnable{

	private CountDownLatch latch;
	
	public Processor(CountDownLatch latch){
		this.latch=latch;
	}
	
	public void run() {
		System.out.println("started");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {	
			e.printStackTrace();
		}
		
		latch.countDown();
	}
}

public class CountDownLatchClass {

	public static void main(String[] args) {
		CountDownLatch latch =new CountDownLatch(4);
		
		ExecutorService execute=Executors.newFixedThreadPool(2);
		
		for(int i=0;i<3;i++){
			execute.submit(new Processor(latch));
		}

		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("completed");
	}

}
