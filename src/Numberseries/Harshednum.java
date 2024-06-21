package Numberseries;

import java.util.Scanner;

//import java.util.Scanner;

public class Harshednum {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enetr the value of num");
			int num=sc.nextInt();
			int rem=0,sum=0,n;
			 n=num;
			
			while(num>0) {
				rem=num%10;
				sum=sum+rem;
				num=num/10;	
			}
			if(n%sum==0) {
				System.out.println(n+": is a harshed num");
			}
			else {
				System.out.println(n+": is not a harshed num");
			}
		}
}
