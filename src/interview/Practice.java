package interview;

public class Practice {
	public static void main(String[] args) {

		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			if(i%2==0) {
				char c='a';
				for(int chr=1;chr<=i;chr++) {
					System.out.print(c+" ");
					c++;
				}
				System.out.println();
			}else {
				for(int k=1;k<=i;k++) {
					System.out.print(k+" ");
				}
				System.out.println();
			}
			
		}
	}
}

