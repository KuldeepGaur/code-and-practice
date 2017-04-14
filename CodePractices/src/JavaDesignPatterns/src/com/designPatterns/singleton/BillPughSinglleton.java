package JavaDesignPatterns.src.com.designPatterns.singleton;

public class BillPughSinglleton {

	private BillPughSinglleton(){}
	
	private static class BillPughInnerClass{
	   private static final BillPughSinglleton INSTANCE =new BillPughSinglleton();
	}
	
	public static BillPughSinglleton getInstance(){
		return BillPughInnerClass.INSTANCE;
	}
}
