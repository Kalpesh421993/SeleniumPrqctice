package Hackerrank;

import java.util.Scanner;

public class Javaloops2 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the value of t");
	        int t=sc.nextInt();
	        for(int i=0;i<t;i++){
	        	
	        	System.out.println("enter the value of a");
	            int a = sc.nextInt();
	            System.out.println("enter the value of b");
	            int b = sc.nextInt();
	            
	            System.out.println("enter the value of n");
	            int n = sc.nextInt();
	            int m = a;
	            
	            for(int j = 0; j < n; j++) {
	                m+= Math.pow(2,j)*b;
	                System.out.print(m + " ");
	            }
	            System.out.println();
	        }
	        sc.close();
	    }
	            
	        
	}

		

