package Array;

public class Array1 {
	public static void main(String[] args) {

		int x[] = { 10, 22, 34, 56, 77, 90, 14, 56, 76, 88 };
		// int result=0;
		// int index = 0;

		// while loop
		// while(index<=9) {
		// System.out.println(x[index]);
		// index++;

		// for loop
		// for (int i = 0; i<=x.length; i++) {
		// if(x[i]%2==0)
		// System.out.println(x[i]);

		// for each loop
		for (int y : x) { // for each loop ,short hand for loop
			if (y % 2 == 0)
				System.out.println(y);

		}

	}       

}
