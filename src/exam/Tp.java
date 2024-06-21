package exam;

public class Tp {
	/*	Tp(int a ,int b){
			System.out.println("a="+a+ "b="+b);
		}
		Tp(int a,float b){
			System.out.println("a="+a+ "b="+b);
		}
	 */	
	public static void main(String[] arr) {

		//byte a=10;
		//byte b=15;
		//Tp tp=new Tp(a,b);

		//		Integer num1=100;
		//		Integer num2=100;
		//		Integer num3=50;
		//		Integer num4=50;
		//		if(num1==num2) {
		//			System.out.println("num1==num2");
		//		}else {
		//			System.out.println("num1!=num2");
		//		}
		//		if(num3==num4) {
		//			System.out.println("num3==num4");
		//		}else {
		//			System.out.println("num3!=num4"); 
		//	    }

		/*int x=	10;
		int y= x++;
		System.out.println(x);
		System.out.println(y);
		 */

		//System.out.println('j'+'a'+'v'+'a');
		String str="Testing Shastra";
		str= str.toLowerCase();
		System.out.print("Vowels are :");
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.print(ch+" ");
			}else {
				System.out.println(ch+" ");
		}
		
//		System.out.println();
//		System.out.print("Consonant are: ");
//		for(int i=0;i<str.length()-1;i++) {
//			char ch=str.charAt(i);
//			if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')) {
//				System.out.print(ch+" ");
			}
		}
	}


