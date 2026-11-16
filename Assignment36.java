package assignments.java;

import java.util.Scanner;

public class Assignment36 {

	public static void main(String[] args) {
		// "WAP to calculate  area & circumference using scanner class for square"
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of side length of square : ");
		int s = sc.nextInt();
		
		System.out.println("The are of square is : " + (s*s));
		System.out.println("The circumference of square is : " + (4*s));
	}

}
