//"WAP to accept all the values of array at run time"

package assignments.java;

import java.util.Arrays;
import java.util.Scanner;

public class Assignments63 {

	public static void main(String[] args) {
		System.out.println("Enter the size of array : ");
		Scanner sc=new Scanner(System.in);
		int[] arr= new int[sc.nextInt()];
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Please enter the value of array at index "+ i +" : ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Here is the final array : ");
		System.out.println(Arrays.toString(arr));

		
	}

}
