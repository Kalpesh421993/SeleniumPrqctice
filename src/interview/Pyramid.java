package interview;
 //do
public class Pyramid {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");

			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k+" ");
			}
			
			
			for (int m = 1; m <= n - i; m++) {
				System.out.print("  ");

			}
			for (int p = 1; p <= i; p++) {
				System.out.print(p+" ");
			}
			System.out.println(" ");
		}
		
	
	}

}
