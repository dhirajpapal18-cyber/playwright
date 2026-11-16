package assignments.java;

import java.util.Scanner;

public class Assignment101 {

	public static void main(String[] args) {
		//WAP to handle ArithmaticException
		try
		{
			int num=10/0;
			System.out.println(num);
		}
		catch(Exception e1)
		{
			System.out.println("Handled the given exception : " +e1);
		}
		
		

	}

}
