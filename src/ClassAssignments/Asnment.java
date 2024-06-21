package ClassAssignments;
//qqqq
public class Asnment {
	public static void main(String[] args) {

		int n = 7;

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i - j == 3 ||i + j == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 8; j++) {
				if (i - j == 0 || i + j == 8) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
}