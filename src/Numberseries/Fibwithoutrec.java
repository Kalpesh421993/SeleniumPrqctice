package Numberseries;

public class Fibwithoutrec {
	public static void main(String[] args) {
		
		int fib_limit=10;
		int first=0;
		int second=1;
		
		for(int i=2;i<fib_limit;i++) {
			
			int next=first+second;
			System.out.println(next+" ");
			first=second;
			second=next;
		}
	}
	
}
