package String;

public class String1 {
	public static void main(String[] args) {
		
		String s1="helloh kp";
		String s2=" my name is kp ";
		String s3="Testing Shastra";


  	    System.out.println(s1.charAt(3));
   		System.out.println(s2.length());//length of string
    	System.out.println(s1.indexOf("h"));
		System.out.println(s1.lastIndexOf('h'));
		
		System.out.println(s1.equals(s2));
		
		s1.toCharArray();
		//s1.indent(5);
		//System.out.println(s1.indent(5));
		//System.out.println(s1.contains(s3)); //check same string
		//System.out.println();
		//System.out.println(s1.repeat(4));
		System.out.println(s1.replace("hello", "kalpesh"));
		
		
		s1.trim();
		System.out.println(s1.trim());
		
		
	
		
		
		
		
		
		
		
		
//		System.out.println(s1+s2+s3);  // method 1 concat of multiple strings
//		System.out.println(s1.concat(s2)); //method 2 of concat string with concat keyword-single concat only 2 strings
//		System.out.println(s1.concat(s2).concat(s3)); //method 3
//		System.out.println(s1.concat(s2+s3)); //method 4		
//		System.out.println("hi "+"my name is "+"kalpesh");//we can concat string by hardcoding string		
//		System.out.println("hi ".concat(s1+s2+s3));//method 5
		
	}
}
	