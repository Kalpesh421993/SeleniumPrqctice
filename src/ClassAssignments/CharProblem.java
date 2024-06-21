package ClassAssignments;

public class CharProblem {
	public static void main(String[] args) {
		
		//char c='A';
		int n=5;
		
		for(int i=n;i>=1;i--) {
			char c='A';
			for(int chr=1;chr<=i;chr++) {
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
	}
	
}
