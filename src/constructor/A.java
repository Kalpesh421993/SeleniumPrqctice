package constructor;

public class A {

	public static void main(String[] args) {
		// String.String1 s = new String.String1();
		int n = 5;

		for (int i = n; i >= 0; i--) {
			for (int j = 0; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
