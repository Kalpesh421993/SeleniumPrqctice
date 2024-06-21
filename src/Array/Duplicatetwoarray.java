package Array;

public class Duplicatetwoarray {

	public static void main(String[] args) {
		int x[] = { 1, 2, 2, 4, 3, 1, 5, 6, 4, 6 };
		int y[] = { 1, 5, 66, 77, 55, 77, 44, 66, 33, 55, 44, 66, 77, 33 };

		int z[] = new int[x.length + y.length];
		Duplicate d = new Duplicate();
		int count = 0;

		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {

				if (x[i] == x[j] && !d.duplicatefinder(z, x[i])) {
					z[count++] = x[i];
				}
			}

		}
		for (int i = 0; i < y.length; i++) {
			for (int j = i + 1; j < y.length; j++) {

				if (y[i] == y[j] && !d.duplicatefinder(z, y[i])) {
					z[count++] = y[i];
				}
			}

		}
		System.out.println("Duplicate elements from both arrays:");
		for (int i = 0; i < count; i++) {
			System.out.println(z[i]);

		}
	}

	public boolean duplicatefinder(int array[], int number) {
		for (int i = 0; i < array.length; i++) {
			if (number == array[i]) {

				return true;
			}
		}
		return false;
	}


}
