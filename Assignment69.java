//WAP to find out if the string is anagram?
package assignments.java;

import java.util.Arrays;
import java.util.Scanner;
public class Assignment69 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st word : ");
		String a= sc.next();
		System.out.println("Enter 2nd word : ");
		String b=sc.next();
		char[] ch1=a.toCharArray();
		char[]ch2=b.toCharArray();
		System.out.println("***Before Sort***");
		System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch2));
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println("***After Sort***");
		System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch2));
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("Both are anagram words to each other....!");
		}
		else
		{
			System.out.println("Its not anagram word....!");
		}
	}

}
