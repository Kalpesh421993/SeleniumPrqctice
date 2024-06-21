// calculate the sum of the series 1/4 + 2/8 + 3/12  ...n
package Numberseries;

import java.util.Scanner;

public class Sumofseries {
	
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the n value:");
	
	int n=sc.nextInt();
	
	double sum=0;
	System.out.println("Number of series for 1/4 + 2/8 + 3/12");
	for(int i=1;i<=n;i++) {
		sum+= (double)i / (i * 4);
		
		System.out.print(sum+",");
	}
	//System.out.println("Sum of the series: " + sum);
    sc.close();
	
  }
}
