package volatileKeyWordUse;

import java.util.Scanner;

public class VolatilekeyWord {

/**				

	 * This programme shows the use of volatile keyword
	 *
	 * As threads implementation varries from sustem to system thats why
	 * caching is used by threads for optimization of code in java. due to which it does't
	 * even care for some of the varibles used in the thread if the value of variable is not
	 * modified inside the thread. Volatile keyword guarantees this type of situations that if
	 * value of varible is't used inside the Thread even thread is gonna care for the changes
	 * which depends on that variable
	 */
	
	
	public static void main(String[] args) {
		
		testThreadForVolatileKeyword threadByRunnable=new testThreadForVolatileKeyword();
		Thread testThread = new Thread(threadByRunnable);
		testThread.start();

		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		threadByRunnable.stopThread();
	}

}

class testThreadForVolatileKeyword implements Runnable{
	volatile boolean isThreadRuning=true;
	
	public void run(){
		while(isThreadRuning){
			System.out.println("hi thread is running");
		}
	}
	
	public void stopThread(){
		isThreadRuning = false;
	}
}
