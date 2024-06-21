package Array;
//   sum of array elements 15=1+5 
public class Sample {
	public static void main(String[] args) {

		int x[] = { 11,34,56,23,9,13,48,45};

		for (int i = 0; i < x.length; i++) {

			int num=x[i];
			int digitsum = num % 10;
			
			int number = num / 10;

			x[i] = digitsum + number;
		
			System.out.print(x[i] + ",");
			
			}
		}
	}

