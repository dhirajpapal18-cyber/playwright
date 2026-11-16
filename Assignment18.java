package assignments.java;

import java.util.Scanner;

public class Assignment18 {

	public static void main(String[] args) {
	/* 
	"Write a Java program to validate a user login system using nested if-else statements.
	If the username is correct Then check the password If password is correct - print ""Login successful""
	Else - print ""Incorrect password"" Else - print ""Invalid username"""
	*/
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Username : ");
		String userName= obj.next();
		System.out.println("Enter Password");
		String pass= obj.next();
		
		
		if(userName.equals("Dhiraj"))
		{
			if(pass.equals("Dhiraj@123"))
			{
				System.out.println("\"Login successful\"");
			}
			else
			{
				System.out.println("\"Incorrect password\"");
			}
		}
		else
		{
			if(!userName.equals("Dhiraj") && !pass.equals("Dhiraj@123"))
			{
				System.out.println("Invalid Username as well as password");
			}
			else
			{
				System.out.println("\"Invalid Username\"");
			}
		}
		obj.close();
		
	}

}
