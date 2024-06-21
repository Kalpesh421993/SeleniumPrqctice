package Array;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
			
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int x[]=new int[size];
		System.out.println("Enter the array element");
		
		for(int i=0;i<size;i++) {
			x[i]=sc.nextInt();
		}
		
		System.out.println("enter the element to be searched");
		int searchelement=sc.nextInt();
		int index=0;
		
		for(int i=0;i<size;i++) {
			if(x[i]==searchelement) {
				index=i;
			}
		}
			System.out.println("index of an array elemenet is:"+index);
		}
		
		}
		