package ClassAssignments;

public class Sampleforstar3 {
		public static void main(String[] args) {
			//fisrt half
			int n=5;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				
				System.out.print("*");
			}
			System.out.println();
			}
			
			//second half
			for(int i=n-1;i>=1;i--) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				
				System.out.print("*");
			}
			System.out.println();
			}
		}
	}

		
