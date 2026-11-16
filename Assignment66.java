/*
WAP to check if we can copy the value of 1 array into another in reverse order
 */
package assignments.java;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment66 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int a= sc.nextInt();
		int[] arr1=new int[a];
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println("Enter the value of arr1 at index " + i + " : ");
			arr1[i]=sc.nextInt();
		}
		System.out.println("Here is arr1 : ");
		System.out.println(Arrays.toString(arr1));
		
		
		int[] arr2=new int[a];
		for(int i=a-1,j=0;j<a; j++,i--)
		{
			arr2[j]=arr1[i];
		}
		System.out.println("Here is arr2 : ");
		System.out.println(Arrays.toString(arr2));
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Congrats, you copied arr1 in to arr2...!!!!");
		}
		sc.close();

	}

}
