package assignments.java;

import java.util.Scanner;

public class Assignment102 {
	
	public static void main(String[] args)
	{
		//WAP to handle InputMismatchException and WAP on finally keyword
		
		
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the value : ");
				try
				{
					int num=sc.nextInt();
				}
				catch(Exception e2)
				{
					System.out.println("You have entered incorrect datatype please add integer value : ");
					System.out.println("Handled the given exception : " +e2);
				}
				finally
				{
					sc.close();
				}
	}

}
