package com.oopconcept;

public class Test {
		public static void main(String[] args) {
			
			B b =new B();
			b.m1();// use B.m1() for static
			System.out.println(b.x); 
			System.out.println(b.i);//use B.x for static varibale no need object for code compliance
		}
}