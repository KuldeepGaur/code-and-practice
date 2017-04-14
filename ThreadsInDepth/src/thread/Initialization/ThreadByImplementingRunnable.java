package thread.Initialization;

public class ThreadByImplementingRunnable {
	
	public static void main(String[] args) {


		Thread thread= new Thread(new ThreadByRunnable());
		thread.start();
	}

}
 
class ThreadByRunnable implements Runnable{

	int count=0;
	public void run(){
		while(true){
			System.out.println("hi there count is "+count);
			count ++;
		}
	}
}