package Youtube;

public class BorderDiamond {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {

				if (j - i == n / 2 || i + j == (n / 2) + 2 || i - j == (n / 2) || i + j == n + (n / 2) + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
}
