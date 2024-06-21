package constructor;

import java.util.Scanner;

public class Fibo {
		
	public int fibRecursion(int count) {
	    if (count == 0) {
	      return 0;
	    } 
	    if (count == 1 || count == 2) {
	      return 1;
	    } 
	    return fibRecursion(count - 1) + fibRecursion(count - 2);
	  }

	  public static void main(String args[]) {
		Fibo f=new Fibo();
		Scanner sc=new Scanner(System.in);  
		System.out.println("enter the limit for fibo series");
	    int fib_limit = sc.nextInt();

	    System.out.print("Fibonacci Series of " + fib_limit + " numbers is: \n");

	    for (int i = 0; i < fib_limit; i++) {
	      System.out.print(f.fibRecursion(i) + " ");
	    }
	  }
	}
