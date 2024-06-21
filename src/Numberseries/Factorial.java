package Numberseries;

import java.util.Scanner;

public class Factorial {
	    public int factorial(int n) {
	        if (n <= 1)
	            return 1;
	        else
	            return n * factorial(n - 1);
	    }

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter the number");
	        int number = sc.nextInt();
	        
	        Factorial f=new Factorial();
	        System.out.println("Factorial of " + number + " is " + f.factorial(number));
	    }
	}

	

