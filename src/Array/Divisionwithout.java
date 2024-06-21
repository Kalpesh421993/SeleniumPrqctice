package Array;

import java.util.Scanner;

public class Divisionwithout {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter divident value:");
		
		int divident=sc.nextInt();
		System.out.println("enter divisor value:");
		int divisor=sc.nextInt();
		
		int quotiont= 0;
		
		while(divident>= divisor) {
			
			divident=divident-divisor;
			quotiont++;
		}
		System.out.println("Division:"+quotiont);
	}
}



