package org.singleton;

/**
 * Here the singleton instance is created within static block
 *
 */
public class StaticBlockInitializedSingleton {
	
	/**
	 * Only instance of the singleton class
	 */
	private static StaticBlockInitializedSingleton instance;
	
	/**
	 * Private constructor to avoid any other instance creation
	 */
	private StaticBlockInitializedSingleton() {}
	
	/**
	 * Provides way for exception handling
	 */
	static{
		try{
			instance = new StaticBlockInitializedSingleton();
		} catch(Exception e) {
			System.out.println("Error occured while constructing the singleton object within the static block");
		}
	}
	
	public static StaticBlockInitializedSingleton getInstance() {
		return instance;
	}

}
