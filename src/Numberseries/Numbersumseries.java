package Numberseries;

import java.util.Scanner;

public class Numbersumseries {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the value of x:");
		int x=sc.nextInt();
		System.out.println("enter the value of N:");
		int n=sc.nextInt();
		double sum=0;
		for(int i=1;i<=n;i++) {
			sum+= (double) x/ Math.pow(2,i);
			//sum+= x/i;
			
		System.out.println();	
		}
		System.out.println("Sum of the series: " + sum);
	    sc.close();
		
	  }
	}

