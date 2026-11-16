package assignments.java;

import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) {
		/*
		  WAP to check person can vote only if he/she is 18 or above
		  and should not vote if age is less.
		 */
		
		System.out.println("Please enter your age : ");
		Scanner obj=new Scanner(System.in);
		int age= obj.nextInt();
		
		if(age>=18)
		{
			System.out.println("Your are elegible for vote.");
		}
		else
		{			
			System.out.println("Your are not elegible for vote.");
		}
		
		obj.close();
	}
	

}
