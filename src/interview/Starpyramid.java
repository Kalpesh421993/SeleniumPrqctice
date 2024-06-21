package interview;

public class Starpyramid {
		public static void main(String[] args) {
			
			int n=5;
			
			for(int i=1;i<=n;i++) { //outer loop
				
				//for spaces logic
				for(int j=1;j<=n-i;j++) {
					System.out.print(" ");
				}
			    // for star logic
				for(int j=1;j<=i;j++) {
					System.out.print(j+" ");
				}
			System.out.println();			
			}
		}
}


