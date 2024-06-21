package interview;

public class Leftpascal {
	public static void main(String[] args) {
		int n=4;
		int i=0;
		//first half
		for( i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		//second half
		for(int k=n-1;k>=1;k--)
		{
			for(int l=1;l<=k;l++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}
}
