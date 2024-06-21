package Array;

public class Duplicate {


	public static void main(String[] args) {

		int x[] = { 1, 2, 2, 4, 3, 1, 5, 6, 4, 6, 2, 4, 6, 2, 4, 6, 2, 4, 6 };
		int y[] = new int[x.length];

		Duplicate d = new Duplicate();
		int count = 0;

		System.out.println("Duplicate elements:");
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {

				if (x[i] == x[j] && !d.duplicatefinder(y, x[i])) {
					y[count++] = x[i];
				}
			}

		}
		for (int i = 0; i < count; i++) {
			System.out.println(y[i]);
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
