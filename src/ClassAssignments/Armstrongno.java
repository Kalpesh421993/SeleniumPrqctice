package ClassAssignments;

import java.util.Scanner;

public class Armstrongno {
	public static void main(String[] args) {

		
		int num,number, temp, total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a 3 digit number:");
		num = sc.nextInt();
		sc.close();

		number = num;
		for (; number != 0; number /= 10) {
			temp = number % 10;
			total = total + (temp * temp * temp);

		}
		if (total == num) {
			System.out.println(num + ": is an armstrong number");

		} else {
			System.out.println(num + ": is not an armstrong number");
		}
	}
}
