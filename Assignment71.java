/*
Write a Java program to split the string "My name is Vishnu" into 4 parts
using split(" ", 4) and print the result.
*/
package assignments.java;
import java.util.Arrays;

public class Assignment71 {

	public static void main(String[] args) {
		String str="My name is Vishnu";
		System.out.println("***String split into 1 part : ***");
		System.out.println(Arrays.toString(str.split(" ", 1))+"\n");
		
		System.out.println("***String split into 2 part : ***");
		System.out.println(Arrays.toString(str.split(" ", 2))+"\n");
		
		System.out.println("***String split into 3 part : ***");
		System.out.println(Arrays.toString(str.split(" ", 3))+"\n");
		
		System.out.println("***String split into 4 part : ***");
		System.out.println(Arrays.toString(str.split(" ", 4))+"\n");
		
	}

}
