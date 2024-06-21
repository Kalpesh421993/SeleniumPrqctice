package com.oopconcept;

   public class A{
	public int x = 90;
	int i; //instance final varibale ,we can meke blank final varible in instance block and constructor
	{
		i=66;  //instance block for final variable
	}
	public A() {
		i=78;
	}
	
	static
	 {

		System.out.println("i am static block");
	 }
	 protected void m1() {

		System.out.println("i am method m1");
	}

}
