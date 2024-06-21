package Array;


public class ArrayMethod {

	int count = 0;

	public static void main(String[] args) {

		int x[] = new int[5];
		ArrayMethod a = new ArrayMethod();

		for (int i = 0; i <x.length; i++) {  //element
			a.insert(x, i);
		}
		for (int i = 0; i <x.length; i++) { //index
			a.print(x[i]);
		}
	}

	public void insert(int k[], int value) {

		k[count++] = value*10;
		//count++;
	}

	public void print(int value) {
		System.out.println(value);

	}

}
