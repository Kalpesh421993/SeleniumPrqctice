package Numberseries;

import java.util.Scanner;

public class Practice {
	

	static int B;
	static int H;
	static Boolean flag;

	static {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value for b");
		B = sc.nextInt();
		System.out.println("enter the value for h");
		H = sc.nextInt();
		sc.close();
	}

	public static void main(String[] args) {
		if (B <= 0 || H <= 0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
			if (flag) {
				int area = B * H;
				System.out.print(area);
			}
		} 

	}
