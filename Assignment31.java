

package assignments.java;

import java.util.Scanner;

public class Assignment31 {

	public static void main(String[] args) {
		// WAP on different Math class methods
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number");
		int a= sc.nextInt();
		
		System.out.println("Enter Second number");
		int b= sc.nextInt();
		
		System.out.println(Math.addExact(a, b));
		System.out.println(Math.subtractExact(a, b));
		System.out.println(Math.abs(a));
		System.out.println(Math.divideExact(a, b));
		System.out.println(Math.multiplyExact(a, b));
		
		sc.close();
		
	}

}
