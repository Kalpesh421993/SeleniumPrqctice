package String;

public class Dupstring {

	public static String removeDuplicate(String s) {
		String output = "";
		int j=0;
		for (int i = 0; i < s.length(); i++) {
			
			for (j = 0; j < i; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					break;
				}
			}
			if (i == j) {
				output = output + s.charAt(i);
			}
		}
		return output;
	}
	public static void main(String[] args) {
		String str = "java";
		System.out.println("original string:" + str);
		System.out.println("after remove duplicate char:" +removeDuplicate(str));
	}
}
