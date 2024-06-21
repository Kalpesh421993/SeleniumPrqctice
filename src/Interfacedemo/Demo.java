package Interfacedemo;

public interface Demo {
		
	int i=89;  //Static ,final
	public void m1();
	default void m3() {
		
	}
	public static void y1() {  //cant be implemented
	
	}
 }
