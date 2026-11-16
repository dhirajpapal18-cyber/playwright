package assignments.java;

import java.util.Scanner;

public class Assignment34 {

	public static void main(String[] args) {
		// "WAP to calculate  area & circumference using scanner class for triangle"
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of base of triangle : ");
		int base= sc.nextInt();		
		System.out.println("Enter the value of height of triangle : ");
		int height= sc.nextInt();
		
		System.out.println("The are of triangle is : " + (0.5*base*height));
		
	
		
		
		System.out.println(" ");
		System.out.println("**Please enter the three sides length so we can find out the circumference of triangle**");
		System.out.println(" ");
		System.out.println("enter the length 1st side of triangle : ");
		int firstSide= sc.nextInt();	
		System.out.println("enter the length 2nd side of triangle : ");
		int secondSide= sc.nextInt();
		System.out.println("enter the length 3rd side of triangle : ");
		int thirdSide= sc.nextInt();
		System.out.println("The circumference of triangle is : " + (firstSide+secondSide+thirdSide));
		sc.close();
		
	}

}
