package thread.Initialization;

public class ThreadByExtendingThreadClass{

	public static void main(String [] args){
		
		threadByExtending Thread=new threadByExtending();
		Thread.start();

	}
	
}

class threadByExtending  extends Thread{

	int count=0;
	public void run(){
		while(true){
			System.out.println("hi there count is "+count);
			count ++;
		}
	}
	
}
