package assignments.java;

import java.util.Scanner;

public class Assignment33 {

	public static void main(String[] args) {
		// "WAP to calculate  area & circumference using scanner class for Circle"
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of radius : ");
		int rad= sc.nextInt();
		
		System.out.println("The area of circle is : " + (Math.PI*(rad*rad)));
		System.out.println("The circumference of circle is : " + (2*Math.PI*rad));
		sc.close();

	}

}
