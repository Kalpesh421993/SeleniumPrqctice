package com.oopconcept;
//poly=multiple

//single name multipple forms

//method overloading
public class Poly {

	public int m1(int x,int y) {
		return x+y;
	}

	public int m1(int x,int y,int z) {
		return x+y+z;

	}
	
	public int m1(byte a,byte b) {
		System.out.println("adding two byte");
		return a+b;
	}
	
	
//	public int m1(int...x) {  //vararg array
//		int r=0;
//		for(int i: x) {
//			r=r+1;
//	}
	//return r;
	}

