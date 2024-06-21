package String;

public class Reverse {
	public static void main(String[] args) {
        String original = "how to do in java";
//      String main="how";
        String reversed = reverseString(original);
        
        //reversed= reversed.substring(0,1).toUpperCase()+reversed.substring(1).toLowerCase();
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
        
//        System.out.println(original.contains(main));
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    		
	}

