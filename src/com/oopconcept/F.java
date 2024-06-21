package com.oopconcept;
//method overriding child class

public class F extends E {
	
	@Override
	public String m1(String adharNumber, String panNumber) {
		System.out.println("child class method");
			
		return "hi";
	}
}
