/*
 WAP to find out the average of all the numbers that we have in array
 */
package assignments.java;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment67 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int[] arr=new int[sc.nextInt()];
		double total=0.0;
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the value of arr of index " + i +" : ");
			arr[i]=sc.nextInt();
			total=total+arr[i];
		}
		
		System.out.println("Here is the arr : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("The average of the number present in arr is : " + total/arr.length);
		

	}

}
