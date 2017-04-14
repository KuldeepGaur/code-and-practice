package JavaDesignPatterns.src.com.designPatterns.singleton;

public class StaticBlockInitialization {

	public static StaticBlockInitialization instance;

	private StaticBlockInitialization() {
	}

	static {

		try {
			instance = new StaticBlockInitialization();
		} catch (Exception e) {
			throw new RuntimeException(
					" exception occured in Static block initialization");
		}
	}

	public static StaticBlockInitialization getInstance() {
		return instance;
	}

}
