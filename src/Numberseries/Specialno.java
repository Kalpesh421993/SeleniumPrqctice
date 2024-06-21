package Numberseries;

import java.util.Scanner;

public class Specialno {
		public static void main(String[] args) {
			
			int num,rem;
			int sumoffactor=0;
			
			Scanner sc=new Scanner(System.in) ;
			System.out.println("enter number:");
			int n=sc.nextInt();
			num=n;
			while(num>0) {
				
				rem=num%10;
				int fact=1;
				for(int i=1;i<=rem;i++) {
					fact=fact*i;
				}
				sumoffactor+=fact;
				num=num/10;
	        }
	        if(n==sumoffactor) {
	        	System.out.println(n+":no is speacial");
	        }
	        else {
	        	System.out.println(n+":no is not special");
	        }
			
			
		}
		
}
