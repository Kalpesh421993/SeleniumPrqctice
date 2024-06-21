package String;

public class stringBuffer {
	public static void main(String[] args) {
		
		String s= "hello";
		
		s.concat(" Testing ");
		System.out.println(s);
		
		////----
		
		StringBuffer sb=new StringBuffer("hello");
		sb.append("testing ");
		System.out.println(sb);
		
		StringBuilder sb1	=new StringBuilder("kakak");
		sb1.insert(0, "e");
		System.out.println(sb1);
		
	}
}
