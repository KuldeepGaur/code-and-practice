package thread.Initialization;

public class ThreadByAnnonymousClass {

	public static void main(String[] args) {


		Thread Thread = new Thread(new Runnable() {
			
			int count=0;
			public void run() {
				
				while(true){
					System.out.println("hi there count is "+count);
					count ++;
				}
				
			}
		});
		
		
		Thread.start();
	}

}
