package producerConsumer;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class ProducerConsumnerProblem {

	private static BlockingQueue<Integer> blockQueue=new ArrayBlockingQueue(10);
	
	public static void main(String[] args) {

		Thread t1=new Thread(new Runnable() {
			
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		
	Thread t2=new Thread(new Runnable() {
			
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	
	
	t1.start();
	t2.start();
	
	try {
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	
	private static void producer() throws InterruptedException{
		Random random = new Random();
		
		while(true){
			blockQueue.put(random.nextInt(100));
		}         
	}
	
	
	private static void consumer() throws InterruptedException{
		Random random = new Random();
		
		while(true){
			Thread.sleep(100);
			
			if(random.nextInt(10)==0){
				int value = blockQueue.take();
				
				System.out.println("value taken is "+value+"  queue size is "+blockQueue.size());
			}
		}
	}
}
