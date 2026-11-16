package assignments.java;

import java.util.Scanner;

public class Assignment37 {

	public static void main(String[] args) {
		// Develop Calculator logic using scanner class and switch case.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number : ");
		float a= sc.nextFloat();
		System.out.println("Enter first number : ");
		float b = sc.nextFloat();
		System.out.println("Enter symbol like which operation do you want (+, -, /, *) : ");
		char operator = sc.next().charAt(0);
		
		
		switch(operator) 
		{
		case '+':
			System.out.println(a+b);
			break;
			
		case '-':
			System.out.println(a-b);
			break;
			
		case '*':
			System.out.println(a*b);
			break;
			
		case '/':
			System.out.println(a/b);
			break;
			
		default:
			System.out.println("Invalid Operator Entered");
		}

	}

}
