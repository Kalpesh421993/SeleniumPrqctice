package Array;

import java.util.Scanner;

public class Arrayindexsearchbyuser {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size for array");
		int size = sc.nextInt();
		int x[] = new int[size];

		System.out.println("enter the elements");
		for (int i = 0; i < size; i++) {
			x[i] = sc.nextInt();
		}
		System.out.println("enter the element to search");
		int searchelement = sc.nextInt();
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (x[i] == searchelement) {
				index = i;
			}
		}
		if(index<0) {
			System.out.println("invalid element");
		}else {
		System.out.println("index value of user input element:" + index);
		}
	}
}
