// WAP to check if the string is a palindrome?
package assignments.java;

import java.util.Scanner;

public class Assignment60 {

	public static void main(String[] args) {
		System.out.println("Enter the word : ");
		Scanner sc= new Scanner(System.in);
		String input= sc.next();
		String output = "";
		System.out.println("Length of string is : "+input.length());
		for(int i=input.length()-1;i>=0;i--)
		{
			char c=input.charAt(i);
			output=output+c;
		}
		if(input.equals(output))
		{
			System.out.println("Its Palindrome");
		}
		else {
			System.out.println("Its not palindrome");
		}
		

	}

}
