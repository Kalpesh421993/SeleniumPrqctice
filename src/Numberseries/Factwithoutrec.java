package Numberseries;

public class Factwithoutrec {
		
		public static void main(String[] args) {
			
			int num=4;
			int fact=1;
			
			for(int i=1;i<=num;i++) {
				fact=fact*i;
			}
				System.out.println("Factorial of " +num+" is: "+fact);
			}
		}

