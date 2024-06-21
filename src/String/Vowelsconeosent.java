package String;

public class Vowelsconeosent {

	public static void main(String[] args) {
		String str= "Testing shastra";
		char input[]= str.toCharArray();

		str=str.toLowerCase();
		int vowelscount=0;
		int consonentcount=0;

			//with string 
		//System.out.println("vowels present in the String:");
		//for(int i=0;i<str.length();i++) {
		//char ch=str.charAt(i);
		//if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
		//System.out.println(ch + " ");
		
			//with chararray 
		System.out.println("vowels present in the String:");
		for(int i=0;i<input.length;i++) {
			char ch=input[i];
			if(input[i]=='a'|| input[i]=='e'||input[i]=='i'||input[i]=='o'||input[i]=='u') {
				System.out.println(ch + " ");

				vowelscount++;		
			}else {
				consonentcount++;
			}
		}
		System.out.println("vowelscount:"+vowelscount);
		System.out.println("consonentcount:"+consonentcount);
	}
}
