package exceptionHandling;

public class Multipl {
	public static void main(String[] args) {
        try {
            // Multiple statements within one try block
            int[] numbers = {1, 2, 3};
            int index=2;
            String str = "kp";
            
            int result = numbers[index];
            System.out.println("Result: " + result);
            
            int length = str.length();
            System.out.println("Length: " + length);
            
            
        
        }catch (ArrayIndexOutOfBoundsException e) 
        {    
            System.out.println("ArrayIndexOutOfBoundsException occurred: "+e.getMessage() );
            //e.getSuppressed();
        }catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: "+e.getMessage() );
            
            //e.getSuppressed();
        }catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage()); 
        }finally {
        	
        	System.out.println("finally block");
        	
        }
        System.out.println("Outside of try-catch block.");
    }
}

