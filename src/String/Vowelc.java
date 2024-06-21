package String;

public class Vowelc {
	    public static void main(String[] args) {
	        String str = "Testing Shastra";
	        str = str.toLowerCase(); 
	        
	        System.out.println("Vowels:");
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                System.out.print(ch + " ");
	            }
	        }
	        
	        System.out.println("\nConsonants:");
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if ((ch >= 'a' && ch <= 'z') && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
	                System.out.print(ch + " ");
	            }
	        }
	    }
	}


