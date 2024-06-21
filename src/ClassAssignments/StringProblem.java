package ClassAssignments;

public class StringProblem {

	public static void main(String[] args) {
		// Scanner sc=new Scanner(System.in);
		// System.out.println("Enter a String");
		// String s=sc.nextLine();
		// int l=s.length();
		// System.out.println(l)

		String s = "kalpesh";
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	}
}
