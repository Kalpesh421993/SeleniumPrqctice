package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptiondemo {
	public static void main(String[] args)  {
		
		try {
			System.out.println("start");
			FileInputStream fis= new FileInputStream("C:\\Users\\pujac\\OneDrive\\Documents\\java codes\\ArithmaticSwitchExampleioi.java");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}
