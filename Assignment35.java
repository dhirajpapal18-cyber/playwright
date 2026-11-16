package assignments.java;

import java.util.Scanner;

public class Assignment35 {

	public static void main(String[] args) {
		// "WAP to calculate  area & circumference using scanner class for rectangle"
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of rectangle : ");
		int l = sc.nextInt();
		System.out.println("Enter the width of rectangle : ");
		int w = sc.nextInt();
		System.out.println("The are of circle is : " + (l*w));
		System.out.println("The circumference of circle is : " + (2*(l+w)));
	}

}
