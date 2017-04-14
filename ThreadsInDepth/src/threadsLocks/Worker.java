package threadsLocks;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;;

public class Worker {

	public Random random =new Random();
	
	private Object lock1=new Object();
	private Object lock2=new Object();
	
	private List<Integer> list1=new ArrayList<Integer>();
	private List<Integer> list2=new ArrayList<Integer>();
	
	public synchronized void stageOne() {
		//for running this block the thread has to acuire the intrinsic lock for the block
		try{
			Thread.sleep(1);			
		}catch(InterruptedException e){
			
		}
		list1.add(random.nextInt(100));
	}
	
	public synchronized void stageTwo() {
		
		try{
			Thread.sleep(1);			
		}catch(InterruptedException e){
			
		}
		list2.add(random.nextInt(100));
	}	
	

	public void stageOneWithSynchronizedBlock() {
		synchronized (lock1) {//for running this block the thread has to acuire the intrinsic lock for the block
			
			try{
				Thread.sleep(1);			
			}catch(InterruptedException e){
				
			}
			list1.add(random.nextInt(100));
		}
	}
	
	public void stageTwoWithSynchronizedBlock() {
		synchronized (lock2) {
			try{
				Thread.sleep(1);			
			}catch(InterruptedException e){
				
			}
			list2.add(random.nextInt(100));
		}
	}	
	
	
	public void process() {
		for(int i=0;i<1000;i++){
			stageOne();
			stageTwo();
		}
	}	

	public void processWithSynchBlocks() {
		for(int i=0;i<1000;i++){
			stageOneWithSynchronizedBlock();
			stageTwoWithSynchronizedBlock();
		}
	}
	
	public void main() {
		System.out.println("Starting");
		long start=System.currentTimeMillis();
		
		Thread t1=new Thread(new Runnable() {
			public void run() {
				process();
			}
		});
		
		
		Thread t2=new Thread(new Runnable() {
			public void run() {
				process();
			}
		});
		
		t1.start();
		t2.start();
		
		try{
			t1.join();	
			t2.join();
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		
		long end=System.currentTimeMillis();
		
		
		System.out.println("time taken with synchronized methods "+(end-start));
		System.out.println("list1"+list1.size());
		System.out.println("list2"+list2.size());
		
		
		
		start=System.currentTimeMillis();
		
		t1=new Thread(new Runnable() {
			public void run() {
				processWithSynchBlocks();
			}
		});
		
		
		t2=new Thread(new Runnable() {
			public void run() {
				processWithSynchBlocks();
			}
		});
		
		t1.start();
		t2.start();
		
		try{
			t1.join();	
			t2.join();
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		
		
		end=System.currentTimeMillis();
		
		System.out.println("time taken with synchronized blocks "+(end-start));
		System.out.println("list1"+list1.size());
		System.out.println("list2"+list2.size());
	}
}
