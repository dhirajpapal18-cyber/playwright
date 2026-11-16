/*
WAP to check if the 2 arrays are equals
 */

package assignments.java;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment64 {

	public static void main(String[] args) {
		int[] arr1= new int[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println("Enter the value of 1st array of index " + i + " : ");
			arr1[i]=sc.nextInt();
		}
		System.out.println("Your 1st arrays is here : "+ Arrays.toString(arr1));
		//for 2nd array
		System.out.println("************************");
		int [] arr2=new int[4];
		for(int j=0; j<arr1.length; j++)
		{
			System.out.println("Enter the value of 2nd array of index " + j + " : ");
			arr2[j]=sc.nextInt();
		}
		System.out.println("Your 2nd arrays is here : "+ Arrays.toString(arr2));
		
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Both arr is equal");
		}
		else
		{
			System.out.println("Both arr is different");
		}
	}

}
