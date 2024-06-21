package ifelse;

import java.util.Scanner;

public class RemainderQ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter divident:");
		double divident = scanner.nextInt();

		System.out.println("enter devisor:");
		double devisor = scanner.nextInt();

		double quotient = divident / devisor;
		double remainder = divident % devisor;

		System.out.println("value for quotient:" + quotient);
		System.out.println("value for remainder:" + remainder);
	}
}