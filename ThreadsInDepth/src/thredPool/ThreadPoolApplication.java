package thredPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolApplication {

	public static void main(String[] args) {
		
		ExecutorService execute=Executors.newFixedThreadPool(2);
		
		for(int i=0;i<5;i++){
			execute.submit(new Processor(i));
		}
		
		execute.shutdown();
		System.out.println("all task submitted");
		
		try{
			execute.awaitTermination(1, TimeUnit.DAYS);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}

class Processor implements Runnable{

	private int id;
	public Processor(int id){
		this.id=id;
	}
	
	public void run() {
		System.out.println("starting "+id);
		
		try{
			Thread.sleep(5000);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("Ended "+id);
	}
	
}
