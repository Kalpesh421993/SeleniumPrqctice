package Hackerrank;
 //two array
public class Evenodd2 {
	public static void main(String[] args) {

		int x[] = { 10, 45, 78, 32, 44, 71, 7 };
		int y[] = { 11, 42, 73, 32, 70, 0 };
		int z[] = new int[x.length + y.length];
		
		for (int i = 0; i < x.length; i++) {
			z[i] = x[i];
		}
		for (int i = 0; i < y.length; i++) {
			z[x.length + i] = y[i];
		}

		//System.out.println("3rd(z) array elements:");
		for (int j = 0; j < z.length; j++) {
			//System.out.println(z[j]);
		}

		int even[] = new int[z.length];
		int odd[] =  new int[z.length];

		System.out.println("Even array elements:");
		for (int i = 0; i < z.length; i++) {
			if (z[i] == 0 || z[i] % 2 == 0) {

				even[i] = z[i];
				System.out.print(even[i] + ",");
			}
		}
		System.out.println();
		System.out.println("Odd array elements:");
		for (int j = 0; j < z.length; j++) {
			if (z[j] % 2 != 0) {

				odd[j] = z[j];
				System.out.print(odd[j] + ",");

			}
			
				
		}
		
	}
}
