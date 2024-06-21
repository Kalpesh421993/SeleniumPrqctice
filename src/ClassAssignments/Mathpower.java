package ClassAssignments;

import java.util.Scanner;

public class Mathpower {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		System.out.println("enter the power");
		int x = sc.nextInt();
		
		int sum = 0;

		for (int i = 0; i < x; i++) {
			sum = sum + (int) Math.pow(number, i);
            //int k=(int) Math.pow(number, i);
            //sum=k;
		}

		System.out.println("the sum of the power is: " + sum);

	}
}
