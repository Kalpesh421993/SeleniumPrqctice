package interview;

public class RightdTriangle {
	public static void main(String[] args) {
		int i;
		int n = 5;
		for (i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			
			}
			System.out.println();
		}
	}
}
