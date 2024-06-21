package ifelse;

import java.util.Scanner;

public class Percentagee {

	public static void main(String[] args) {

		int marksObtained, passingmarks;
		passingmarks = 40;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");

		marksObtained = sc.nextInt();

		if (marksObtained >= passingmarks) {

			System.out.println("you are pass");
		} else {
			System.out.println("you are fail");
		}

	}
}
