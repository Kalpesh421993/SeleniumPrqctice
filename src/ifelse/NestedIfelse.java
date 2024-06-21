package ifelse;

import java.util.Scanner;

public class NestedIfelse {
	public static void main(String[] args) {
		int marksObtainted, passingMarks;
		//char grade;
		passingMarks = 40;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Marks Obtained By you");
		marksObtainted = sc.nextInt();
		if (marksObtainted >= passingMarks && marksObtainted <= 100) {
			if (marksObtainted >= 90) {
				System.out.println("grade=A");

			} else if (marksObtainted <= 89 && marksObtainted >= 75) {
				System.out.println("grade =B");

			} else if (marksObtainted <= 74 && marksObtainted >= 60) {
				System.out.println("grade =C");
			} else if (marksObtainted <= 59 && marksObtainted >= 40) {

				System.out.println("grade =D");
			}

		} else if (marksObtainted <= 39 && marksObtainted >= 0) {
			System.out.println("you are fail");
		} else {
			System.out.println("invalid ");
		}
	}

}
