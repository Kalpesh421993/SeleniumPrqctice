package Numberseries;

//2-6+18-54----n
import java.util.Scanner;

public class Sumexp {
	public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value of N:");
			int n=sc.nextInt();
			
			int sum=0;
			int a=2;
			for (int i =1,a=2;i <= n; i++,a=a*3) {
	            sum += (int)a-(a*3);//Math.pow(-1, i) * Math.pow(3, i);
	            a=a*3;
	            System.out.println(sum);
	        }
			//System.out.println("result:"+sum);	
		}
}
