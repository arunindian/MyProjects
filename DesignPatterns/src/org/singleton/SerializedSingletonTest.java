package org.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializedSingletonTest {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		SerializedSingleton ss = SerializedSingleton.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("hello.ser"));
		oos.writeObject(ss);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("hello.ser"));
		SerializedSingleton readObj = (SerializedSingleton)ois.readObject();
		ois.close();
		
		System.out.println(ss.hashCode());
		System.out.println(readObj.hashCode());
		
		
	}

}
