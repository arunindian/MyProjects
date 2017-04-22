package fun.factory;

/**
 * 
 * Factory pattern allows for code to interface rather then implementation.
 * 
 * Removes the instantiation of actual implementation class from client code.
 * 
 * Makes our code more robust, less coupled and easy to extend.
 * 
 * Here we can change the implementation of PC without client being aware of it.
 * 
 * Abstraction between implementation and client class through inheritance.
 * 
 * Here the computer factory generates different types of computer,but returns the reference of computer.
 * So the dependent services need to know only of computer and do not depend on concrete implementation 
 * which is hidden inside the factory.
 *
 */
public class ComputerFactory {
	private static final String PC="PC";
	private static final String SERVER ="SERVER";
	
	public static Computer getComputer(String type,String ram,String hdd, String cpu) {
		if(PC.equalsIgnoreCase(type)) {
			return new PC(ram,hdd,cpu);
		} else if(SERVER.equalsIgnoreCase(type)) {
			return new Server(ram,hdd,cpu);
		}
		return null;
	}

}
