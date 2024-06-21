package exceptionHandling;

public class Trycatch {
	public static void main(String args[]) 
    { 
		int a[] = { 1, 2, 3, 4, 5 }; 
        try { 
  
            System.out.println(a[2]); 
 
            try { 
  
                int x = a[2] / 0; 
            } 
            catch (ArithmeticException e2) { 
                System.out.println("division by zero is not possible"); 
            } 
        } 
        catch (ArrayIndexOutOfBoundsException e1) { 
            System.out.println("ArrayIndexOutOfBoundsException" ); 
        } 
    
        System.out.println("outside try catch block");
    } 
} 

