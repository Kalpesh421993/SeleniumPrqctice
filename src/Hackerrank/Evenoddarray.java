package Hackerrank;
//single array 
public class Evenoddarray {
	public static void main(String[] args) {

		int x[] = { 10, 45, 78, 32, 44, 71, 7, 0 };

		int even[] = new int[x.length];
		int odd[] = new int[x.length];
		int evenIndex = 0, oddIndex = 0;

		for (int i = 0; i < x.length; i++) {
			if (x[i] == 0 || x[i] % 2 == 0) {
				even[evenIndex++] = x[i];
			} else {
				odd[oddIndex++] = x[i];
			}
		}

		System.out.println("Even array elements are: ");
		for(int i = 0; i < evenIndex -1; i++) {
			System.out.print(even[i] + ", ");
		}
		System.out.println(even[evenIndex-1]);

		System.out.println("Odd array elements are: ");
		for(int i = 0; i < oddIndex -1; i++) {
			System.out.print(odd[i] + ", ");
		}
		System.out.println(odd[oddIndex-1]);
	
	}
}
