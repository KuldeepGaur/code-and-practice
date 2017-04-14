package JavaDesignPatterns.src.com.designPatterns.singleton;

import JavaDesignPatterns.src.com.designPatterns.singleton.EagerInitialization;
import JavaDesignPatterns.src.com.designPatterns.singleton.LazyInitialization;
import JavaDesignPatterns.src.com.designPatterns.singleton.StaticBlockInitialization;
import JavaDesignPatterns.src.com.designPatterns.singleton.ThreadSafeSingleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("test for eager initialization");
			
			EagerInitialization instanceOne = EagerInitialization.getInstance();
			EagerInitialization instanceTwo = null;
			
			Constructor[] constructors =EagerInitialization.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instanceTwo = (EagerInitialization) constructor.newInstance();
				break;
			}
			System.out.println("test for eager initialization"+instanceOne.hashCode());
			System.out.println("test for eager initialization"+instanceTwo.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}

		//test for Static block initialization
		try {
			
			System.out.println("test for Statc block initialization");
			
			StaticBlockInitialization instanceOne = StaticBlockInitialization.getInstance();
			StaticBlockInitialization instanceTwo = null;
			
			Constructor[] constructors = StaticBlockInitialization.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instanceTwo = (StaticBlockInitialization) constructor.newInstance();
				break;
			}
			System.out.println("test for Static block initialization"+instanceOne.hashCode());
			System.out.println("test for Static block initialization"+instanceTwo.hashCode());

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//test for Lazy initialization
		try {
			System.out.println("test for Lazy initialization");
			
			LazyInitialization instanceOne = LazyInitialization.getInstance();
			LazyInitialization instanceTwo = null;
			
			Constructor[] constructors =LazyInitialization.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instanceTwo = (LazyInitialization) constructor.newInstance();
				break;
			}
			System.out.println("test for Lazy initialization"+instanceOne.hashCode());
			System.out.println("test for Lazy initialization"+instanceTwo.hashCode());

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//test for Thread safe initialization
		try {
			
			System.out.println("test for Thread safe initialization");
			
			ThreadSafeSingleton instanceOne = ThreadSafeSingleton.getInstance();
			ThreadSafeSingleton instanceTwo = null;
			
			Constructor[] constructors = ThreadSafeSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instanceTwo = (ThreadSafeSingleton) constructor.newInstance();
				break;
			}
			System.out.println("test for Threadsafe initialization"+instanceOne.hashCode());
			System.out.println("test for Threadsafe initialization"+instanceTwo.hashCode());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
