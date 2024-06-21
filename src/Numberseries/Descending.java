package Numberseries;

public class Descending {
	
	public static void main(String[] args) {
		
	
    int x[] = {11,58,35,73,5,18};

	
	for (int j = 0; j < x.length - 1; j++) {
		for (int i = 0; i < x.length - 1; i++) {
			if (x[i] < x[i + 1]) {

				int temp = x[i];
				x[i] = x[i + 1];
				x[i + 1] = temp;

			}
		}
	}
	for (int i = 0; i < x.length; i++) {

		System.out.print(x[i] + " ,");
	}
  }
}


