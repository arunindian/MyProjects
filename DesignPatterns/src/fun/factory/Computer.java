package fun.factory;

/**
 * 
 * Abstract class on which the client depends and code to this interface rather then concrete
 * implementation.
 *
 */
public abstract class Computer {
	
	public abstract String getRAM();
	
	public abstract String getHDD();
	
	public abstract String getCPU();
	
	@Override
	public String toString() {
		return "RAM "+this.getRAM()+"HDD "+this.getHDD()+"CPU "+this.getCPU();
	}

}
