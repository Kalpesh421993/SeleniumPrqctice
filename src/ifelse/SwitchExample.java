package ifelse;


import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter first num:");
		double num1 = scanner.nextDouble();
		
		System.out.println("Enter second num");
		double num2 = scanner.nextDouble();
		
		System.out.println("enter the operation(+,-,*,/);");
		char operation = scanner.next().charAt(0);

		double result;
		
		switch(operation){
			case '+':
				result= num1+num2;
			    System.out.println("Sum="+result);
				break;
				
			case '-':
				result= num1-num2;
			    System.out.println("Difference=" +result);
				break;
				
			case '*':
				result= num1*num2;
			    System.out.println("Multiplication=" +result);
				break;
				
			case '/':
				if(num2!=0) {
					result= num1/num2;
				    System.out.println("Quotiont=" +result);
				} else {
                    System.out.println("Error: Cannot divide by zero.");
				}
				break;
				default:
					System.out.println("Invalid Operation");
				break;	
				
		}
	}
}
