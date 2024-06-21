package interview;

public class ButterflyPattern {
    public static void main(String[] args) {
	int n=4;
	
	//first half
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		for(int j=1;j<=2*(n-i);j++) {//space logic
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	//second part
	for(int i=n-1;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		for(int j=1;j<=2*(n-i);j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
   }
}
