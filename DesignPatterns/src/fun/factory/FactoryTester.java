package fun.factory;

public class FactoryTester {
	
	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.getComputer("PC", "4 GB", "500 GB", "1GHz");
		Computer server = ComputerFactory.getComputer("SERVER", "32 GB", "4 TB", "5 Ghz");
		
		System.out.println("PC Config "+pc.toString());
		System.out.println("Server config "+server.toString());
	}
}
